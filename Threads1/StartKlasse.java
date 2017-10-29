package Threads1;

public class StartKlasse {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hauptklasse startet");
		AusgabeThread thread1 = new AusgabeThread("Ich bin Thread1");
		thread1.start();
		AusgabeThread thread2 = new AusgabeThread("Ich bin Thread2");
		thread2.start();
		AusgabeThread thread3 = new AusgabeThread("Ich bin Thread3");
		thread3.start();

		thread1.notify();
		thread2.join();
		thread3.join();

		System.out.println("Hauptklasse ist beendet");

	}

}
