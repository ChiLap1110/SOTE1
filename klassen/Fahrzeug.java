package klassen;

public class Fahrzeug {

	void machwas(){
		System.out.println("Fahrzeug machwas");
	}
	
	public static void main(String[] args) {
		Fahrzeug f = new Fahrzeug();
		Auto b = new Auto();
		System.out.println(f.getClass());
	}
}
