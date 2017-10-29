package Application;

public class Application {

	private IDB DB;

	public Application(IDB DB) {
		this.DB = DB;
	}
	
	public void welche(){
		DB.datenbank();
		
	}

}
