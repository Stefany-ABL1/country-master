package edu.uptc.country.model;



public class Conutry implements Comparable<Conutry>{
	private String idConuntry;
	private String nameConutry;
	private String mainCapital;
	private EtypeCountry typeCountry;
	
	public Conutry(String idConuntry, String nameConutry, String mainCapital, EtypeCountry typeCountry) {
	
		this.idConuntry = idConuntry;
		this.nameConutry = nameConutry;
		this.mainCapital = mainCapital;
		this.typeCountry = typeCountry;
	}

	public String getIdConuntry() {
		return idConuntry;
	}

	public void setIdConuntry(String idConuntry) {
		this.idConuntry = idConuntry;
	}

	public String getNameConutry() {
		return nameConutry;
	}

	public void setNameConutry(String nameConutry) {
		this.nameConutry = nameConutry;
	}

	public String getMainCapital() {
		return mainCapital;
	}

	public void setMainCapital(String mainCapital) {
		this.mainCapital = mainCapital;
	}

	public EtypeCountry getTypeCountry() {
		return typeCountry;
	}

	public void setTypeCountry(EtypeCountry typeCountry) {
		this.typeCountry = typeCountry;
	}

	@Override
	public String toString() {
		return "Conutry [idConuntry=" + idConuntry + ", nameConutry=" + nameConutry + ", mainCapital=" + mainCapital
				+ ", typeCountry=" + typeCountry + "]";
	}

	@Override
	public int compareTo(Conutry o) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				return this.idConuntry.compareTo(o.getIdConuntry());//ordenar alfabeticamente
				//return this.brand.length()-arg0.getBrand().length();//ordenar por tamaño
	
	}

}
