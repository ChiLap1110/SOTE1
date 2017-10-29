package UML;

public class Konto {
	private Kunde kunde;
	private int kontonr;

	public Konto( int kontonr) {
	this.kontonr = kontonr;
	}

	public int getKontonr() {
		return kontonr;
	}

	public void setKontonr(int kontonr) {
		this.kontonr = kontonr;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}
}
