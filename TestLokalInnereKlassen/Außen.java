package TestLokalInnereKlassen;

public class Au�en {

	public void machwas() {
		System.out.println("�u�ere:machwas");

		int i = 3;

		class Innere {
			public void machwas() {
				System.out.println("Innere:machwas " + i);

			}
		}
		Innere innere = new Innere();
		innere.machwas();
	}

}
