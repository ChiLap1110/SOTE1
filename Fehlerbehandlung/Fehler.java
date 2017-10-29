package Fehlerbehandlung;

public class Fehler extends Exception {
	private String text;
	public Fehler(String text){
		super(text);
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	

}
