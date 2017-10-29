package threads;

public class Philosoph extends Thread {
	public int philonummer;
	Gabel gabellinks;
	Gabel gabelrechts;

	public Philosoph(Gabel gabellinks, int philonummer, Gabel gabelrechts) {
		this.philonummer = philonummer;
		this.gabellinks = gabellinks;
		this.gabelrechts = gabelrechts;
	}

	public void run() {

		for (int i = 0; i <= 4; i++) {

			int essen = (int) (Math.random() * 1001);
			int nachdenken = (int) (Math.random() * 1001);

			try {
				sleep(nachdenken);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			gabellinks.warteAuf(this);
			gabelrechts.greifeGabel(this);

			try {
				sleep(essen);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			gabelrechts.legeGabelHin(this);
			gabellinks.legeGabelHin(this);

		}
	}

}
