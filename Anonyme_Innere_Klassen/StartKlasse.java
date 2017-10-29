package Anonyme_Innere_Klassen;

public class StartKlasse {

	public static void main(String[] args) {
		Auto auto = new Auto(new IMotor() {
			public void spritzufuhr(int prozentvonmaximal) {
				System.out.println(prozentvonmaximal);

			}
		});
		auto.gibGas(100);
	}
}