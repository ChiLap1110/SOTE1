package Enums;

import Enums.Treibstoffsorte;

public class Auto {
	public String marke;
	public Treibstoffsorte treibstoff;

	// -------INTERNES ENUM------
	// public enum Treibstoffsorte {
	// Diesel, Normal, Super
	//
	// }
	public Auto(String marke, Treibstoffsorte treibstoff) {
		this.marke = marke;
		this.treibstoff = treibstoff;
	}

	public static void main(String[] args) {
		for (Treibstoffsorte treibstoff : Treibstoffsorte.values()) {
			System.out.println(treibstoff.getOktanzahl()+" "+treibstoff.getName());

		}
	}
}
