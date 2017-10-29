package Exception;

public class Fehler extends Exception {
	String text;

	public Fehler(String text) {
		super(text);
		this.text = text;

	}

}
