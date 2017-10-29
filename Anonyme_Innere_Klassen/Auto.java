package Anonyme_Innere_Klassen;

public class Auto {
	private IMotor motor;

	public Auto(IMotor motor) {
		this.motor = motor;

	}

	public void gibGas(int gewichtaufgaspedal) {
		System.out.println("Das Auto fährt mit " + gewichtaufgaspedal + " km/h");
		motor.spritzufuhr(4);
	}
}
