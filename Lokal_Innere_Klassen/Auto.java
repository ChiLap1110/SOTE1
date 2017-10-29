package Lokal_Innere_Klassen;

public class Auto {

	public void gibGas(int gewichtaufgaspedal) {
		
		System.out.println("Das Auto fährt mit " + gewichtaufgaspedal + " km/h");
		
		//Lokale innere Klasse
		class Motor {
			public void spritzufuhr(int prozentvonmaximal) {
				System.out.println(prozentvonmaximal);

			}
		}
		Motor motor = new Motor();
		motor.spritzufuhr(4);
	}
}
