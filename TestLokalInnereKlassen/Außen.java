package TestLokalInnereKlassen;

public class Außen {

	public void machwas() {
		System.out.println("Äußere:machwas");

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
