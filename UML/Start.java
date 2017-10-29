package UML;

import java.util.Set;

public class Start {

	public static void main(String[] args) {
		Kunde k1 = new Kunde();
		Konto ko1 = new Konto(122);
		k1.addKonto(ko1);
		Konto ko2 = new Konto(123);
		k1.addKonto(ko2);
		k1.addKonto(ko1);
		Set<Konto> konten = k1.ausgeben();
		
		for(Konto konto: konten){
			System.out.println("Konto:"+konto.getKontonr());
		}
		}
	}


