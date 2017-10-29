package JavaDocs;
/**
 * @author chilaphong
 * 
 *
 */
public class Zufall {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Zufall z = new Zufall();
		System.out.println(z.getZufallsZahl(1, 10, 3));
	}

	/**
	 * Das ist die Abstandsmethode
	 * 
	 * Diese berchnet den kleinsten Abstand zweier Zahlen
	 * 
	 * 
	 * @param a Der erste Wert muss kleiner als b sein
	 * @param b Der zweiter Wert muss größer als a sein
	 * @param c Der Abstand zwischen a und b
	 * @return gibt den Abstand zurürck
	 */
	public int getZufallsZahl(int a, int b, int c) {
		
		
		assert(b>a) : " b muss größer als a sein!";
		
		
		return b;
	}

}
