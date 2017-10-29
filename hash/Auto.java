package hash;

public class Auto {
	int fahrgestellnummer;
	String typ;

	public Auto(String typ) {
		this.typ = typ;

	}

	public static void main(String[] args) {
		Auto bmw = new Auto("ABBA");
		System.out.print(bmw.hashcode());
	}

	public int hashcode() {
		int hashi = 0;
		for (int i = 0; i < typ.length(); i++) {
			//liefert ASCII_CODE bei charAtMethode
			hashi += typ.charAt(i)*i;
		}
		return hashi;
	}

}
