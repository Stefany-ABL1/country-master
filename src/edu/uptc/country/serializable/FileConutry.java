package edu.uptc.country.serializable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import edu.uptc.country.model.*;

public class FileConutry extends FileSerializable{
	public FileConutry(){

	}
	public void writer(ManagementCountry mng) throws FileNotFoundException, IOException{
		writerSerializable(mng);
	}
	public ManagementCountry reader() throws FileNotFoundException, ClassNotFoundException, IOException{
		ManagementCountry mngCountry=(ManagementCountry) readerSerializable();
		return mngCountry;
	}
	public void toXML(String path, String name, ArrayList<Conutry>country ) throws IOException {


		Element pais=new Element("PRODUCTOS");
		Document document=new Document(pais);
		Element product=null;
		for(Conutry c:country){
			product=new Element("Pais");
			product.setAttribute(new Attribute("ID", c.getIdConuntry()));
			product.addContent(new Element("nombre").setText(c.getNameConutry()));
			product.addContent(new Element("capital").setText(c.getMainCapital()));
			product.addContent(new Element("tipo").setText(String.valueOf(c.getTypeCountry())));
			document.getRootElement().addContent(product);
		}
		XMLOutputter xmlout=new XMLOutputter();
		xmlout.setFormat(Format.getPrettyFormat());
		xmlout.output(document, System.out);
		PrintWriter print=new PrintWriter(new File(path+name));
		xmlout.output(document, print);
	}

}


