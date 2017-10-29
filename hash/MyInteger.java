package hash;

public class MyInteger {
	String nummer;

	public MyInteger(String nummer){
		this.nummer=nummer;
	}
	public int hashCode() {
		int hashi = 0;
		for (int i = 0; i < nummer.length(); i++) {
			hashi += nummer.charAt(i) * i;
		}
		return hashi;
	}
	public static void main(String[] args) {
		MyInteger a = new MyInteger("Hurensohn");
		System.out.println(a.hashCode());
		MyInteger b = new MyInteger("Hurensohn");
		System.out.println(b.hashCode());
		System.out.println(a==b);
	}
}
