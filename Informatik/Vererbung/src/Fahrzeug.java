
public class Fahrzeug {
	//Attribute
	private int ps;
	private boolean istAusgeliehen;
	private String ausleiher;
	
	//Konstruktoren
	public Fahrzeug(){ }

	public Fahrzeug(int p, boolean i, String a){
		ps=p;
		istAusgeliehen=i;
		ausleiher=a;
	}
	
	//Getter
	public String getAusleiher() {
		return ausleiher;
	}
	
	public boolean isIstAusgeliehen() {
		return istAusgeliehen;
	}
	
	public int getPs() {
		return ps;
	}
	
	//Setter
	public void setAusleiher(String ausleiher) {
		this.ausleiher = ausleiher;
	}
	
	public void setIstAusgeliehen(boolean istAusgeliehen) {
		this.istAusgeliehen = istAusgeliehen;
	}
	
	public void setPs(int ps) {
		this.ps = ps;
	}
	
	//Methoden ausleihen und zurueck
	public void ausleihen(String a){
		istAusgeliehen= true;
		ausleiher = a;
	}
	
	public void zurueck(){
		istAusgeliehen= false;
		ausleiher = null;
	}
}
