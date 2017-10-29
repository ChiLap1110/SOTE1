package Enums;

public enum Treibstoffsorte {
	Diesel(100,"Renn-Diesel"),Super(98,"High-Power-Super"),Normal(95,"Turbo-Normal");
	private String name;
	private int oktanzahl;
	private Treibstoffsorte(int oktananzahl,String name){
		this.oktanzahl=oktananzahl;
		this.name=name;
		
	}
	public int getOktanzahl() {
		return oktanzahl;
	}
	public void setOktanzahl(int oktanzahl) {
		this.oktanzahl = oktanzahl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


