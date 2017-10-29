package threads;

public class Start {

	public static void main(String[] args) throws InterruptedException {
		Gabel gabel0 = new Gabel(0);
		Gabel gabel1 = new Gabel(1);
		Gabel gabel2 = new Gabel(2);
		Gabel gabel3 = new Gabel(3);
		Gabel gabel4 = new Gabel(4);

		Philosoph philosoph0 = new Philosoph(gabel0, 0, gabel4);

		Philosoph philosoph1 = new Philosoph(gabel1, 1, gabel0);

		Philosoph philosoph2 = new Philosoph(gabel2, 2, gabel1);

		Philosoph philosoph3 = new Philosoph(gabel3, 3, gabel2);

		Philosoph philosoph4 = new Philosoph(gabel4, 4, gabel3);
		
		philosoph0.start();
		
		philosoph2.start();
		philosoph2.join();
		
		philosoph4.start();
		
		philosoph1.start();	
		philosoph1.join();
		philosoph3.start();

	}
}
