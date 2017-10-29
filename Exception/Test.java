package Exception;

public class Test {
	public static void division(int x)throws Fehler {
		x=0;
		if (x==0){
			throw new Fehler("Nicht durch null");
		}
	}
	public static void main(String[] args) {
		try {
			division(0);
		} catch (Fehler e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
