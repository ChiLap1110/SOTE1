package klassen;

public class Lokal {
	
	public void machwas() {
		System.out.println("Was");
		class Innere {
			public void machwas() {
				System.out.println("Ich bin Innere");
			}
			

		}
		Innere innen = new Innere();
		innen.machwas();
	}

	public static void main(String[] args) {
		Lokal l = new Lokal();
		l.machwas();
	}
}
