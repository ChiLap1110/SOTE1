package equals;

public class Paeckchen {
	String adresse;
	int groesse;
	
	public Paeckchen(String adresse, int groesse){
		this.adresse=adresse;
		this.groesse=groesse;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getGroesse() {
		return groesse;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}

	

	public static void main(String[] args) {
		Paeckchen paket1 = new Paeckchen("Grenzstrasse",21);
		Paeckchen paket2 = new Paeckchen("Grenzstrasse",214);
	System.out.println(paket1.equals(paket2));

	}

	public boolean equals(Object obj) {
		if(obj==null){
			return false; 
		}
		if(obj == this){
			return true;
		}
	
		Paeckchen paket = (Paeckchen)obj;
		if (this.getAdresse() == paket.getAdresse() && this.getGroesse() == paket.getGroesse()) {
			return true;
		}
		return false;
	}

}
