package edu.uptc.country.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileSerializable {


		private File file;
		private String name;
		private String path;
		public FileSerializable() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public File getFile() {
			return file;
		}
		public void openFile() {
			file=new File(path+name);
		}
		public void writerSerializable(Object object) throws FileNotFoundException, IOException{
			ObjectOutputStream ous=new ObjectOutputStream(new FileOutputStream(file));
			ous.writeObject(object);
			ous.close();
		}
		public Object readerSerializable() throws FileNotFoundException, IOException, ClassNotFoundException{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
			Object object=ois.readObject();
			ois.close();
			return object;
		}
	
}
