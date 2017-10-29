package UML;

import java.util.HashSet;
import java.util.Set;

public class Kunde {
	int kundennr;
	private Set<Konto> konto = new HashSet<Konto>();

	public void addKonto(Konto k) {
		konto.add(k);
		k.setKunde(this);
	}

	public void removeKonto(Konto k) {
		konto.remove(k);
	}

	public boolean contain(Konto k) {
		return konto.contains(k);
	}
	
	public Set<Konto> ausgeben(){
		return konto;
	}

	public int getKundennr() {
		return kundennr;
	}

	public void setKundennr(int kundennr) {
		this.kundennr = kundennr;
	}
}