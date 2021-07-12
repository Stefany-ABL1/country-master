package edu.uptc.country.model;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

import org.jdom2.JDOMException;
import org.jdom2.output.Format.TextMode;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import edu.uptc.country.model.*;
import edu.uptc.country.serializable.*;



public class ManagementCountry {

	private ArrayList<Conutry> country;
	private FileConutry fileCountry=new FileConutry();


	public ManagementCountry() {
		country = new ArrayList<>();
	}

	public boolean addCountry(String idCountry, String name, String capital, String typeCountry){

		EtypeCountry eTypeCountry = null;

		if(typeCountry.equals("Desarrollado")){
			eTypeCountry = eTypeCountry.DESARROLLADO;
		}
		if(typeCountry.equals("Subdesarrollado")){
			eTypeCountry = eTypeCountry.SUBDESARROLLADO;
		}
		if(typeCountry.equals("Otro")){
			eTypeCountry = eTypeCountry.OTRO;
		}
		
		if(find(idCountry) == null){
			return country.add(new Conutry(idCountry,name,capital,eTypeCountry));
		}
		return false;
	}

	public Conutry find(String id){
		for(Conutry country : this.country){
			if(country.getIdConuntry().equals(id)){
				return country;
			}
		}
		return null;
	}

	public ArrayList<Conutry> sort(){
		ArrayList<Conutry> sorted = (ArrayList<Conutry>) country.clone();
		sorted.sort(Comparator.comparing(Conutry::getIdConuntry));
		return sorted;
	}

	public Conutry findBinary(String id){
		ArrayList<Conutry> sorted=sort();
		int begin=0;
		int fin=sorted.size()-1;
		while(begin<=fin){
			int medium=(begin+fin)/2;
			if(sorted.get(medium).getIdConuntry().equals(id)){
				return sorted.get(medium);
			}
			if(sorted.get(medium).getIdConuntry().compareTo(id)>0){
				fin=medium-1;
			}
			else{
				begin=medium+1;
			}
		}
		return null;
	}
	public void delete(String id){
		for(Conutry cr:country){
			if (id.equals(cr.getIdConuntry())) {
				country.remove(cr);
			}
		}
	}

	public boolean update(String id, String name, String capital, String typeCountry){
		if(find(id)!=null){
			find(id).setNameConutry(name);
			find(id).setMainCapital(capital);
			EtypeCountry eTypeCountry = null;

			if(typeCountry.equals("Desarrollado")){
				eTypeCountry = EtypeCountry.DESARROLLADO;
			}
			if(typeCountry.equals("Subdesarrollado")){
				eTypeCountry = eTypeCountry.SUBDESARROLLADO;
			}
			if(typeCountry.equals("Otro")){
				eTypeCountry = EtypeCountry.OTRO;
			
			}
			find(id).setTypeCountry(eTypeCountry);
			return true;
		}
		return false;
	}
	public void exit(){
		System.exit(0);
	}
	public ArrayList<Conutry> getCountry() {
		return (ArrayList<Conutry>) country.clone();
	}
	public ArrayList<Conutry> Car() {
		return (ArrayList<Conutry>) country;
	}

	public ArrayList<Conutry> sortId(){
		ArrayList<Conutry> sorted=(ArrayList<Conutry>) country.clone();
		Collections.sort(sorted, new Comparator<Conutry>() {
			@Override
			public int compare(Conutry o1, Conutry o2) {
				return o1.getIdConuntry().compareTo(o2.getIdConuntry());
			}
		});
		return  sorted;
	}
	public ArrayList<Conutry> sortBrand(){
		ArrayList<Conutry> sorted=(ArrayList<Conutry>) country.clone();
		Collections.sort(sorted, new Comparator<Conutry>() {
			@Override
			public int compare(Conutry o1, Conutry o2) {
				return o1.getNameConutry().compareTo(o2.getNameConutry());
			}
		});
		return sorted;
	}
	public ArrayList<Conutry> sortModel(){
		ArrayList<Conutry> sorted=(ArrayList<Conutry>) country.clone();
		Collections.sort(sorted, new Comparator<Conutry>() {
			@Override
			public int compare(Conutry o1, Conutry o2) {
				return o1.getMainCapital().compareTo(o2.getMainCapital());
			}
		});
		return sorted;
	}

	public void toXML(String path,String name) throws IOException{
		fileCountry.toXML(path,name,country);
	}


	public void setCountry(ArrayList<Conutry> country) {
		this.country = country;
	}

}



