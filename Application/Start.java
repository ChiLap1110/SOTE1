package Application;

public class Start {

	public static void main(String[] args) {
		IDB DB = new DB2();
		DB.datenbank();
		Application app = new Application(DB);
		app.welche();
	}

}
