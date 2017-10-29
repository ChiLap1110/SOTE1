package Threads1;

public class AusgabeThread extends Thread {
	String text;

	public AusgabeThread(String text) {
		this.text = text;
	}

	public void run() {
		
		for (int i = 0; i < 10; i++) {

			try {
				int dauer = (int) (Math.random() * 1001);
				Thread.sleep(dauer);
				System.out.println(text + " " + i + " (" + dauer + ")");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
