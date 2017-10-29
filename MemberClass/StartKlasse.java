package MemberClass;

import MemberClass.Auto.Motor;

public class StartKlasse {

	public static void main(String[] args) {
	Auto auto = new Auto();
	auto.gibGas(100);
	Motor motor = new Auto().new Motor();
	motor.spritzufuhr(3);
	Motor innere = new Auto().new Motor();

	}

}
