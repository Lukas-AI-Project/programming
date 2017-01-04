//Lukas Schulz 1. Semester
public class Raumschiff {
	//Deklarierung der Instanzvariablen
	private String name;
	private int laenge;
	private int breite;
	boolean triebwerke;
	private boolean hyperraum;

	//Konstruktor der Klasse Raumschiff
	public Raumschiff(String na, int lae, int bre, boolean tr, boolean hy){
		name=na;
		laenge=lae;
		breite=bre;
		triebwerke=tr;
		hyperraum=hy;
	}
	//Beschränkung um schlechten Namen zu vermeiden
	public void setname(String na){
		if(!na.equals("Kaan")){
			System.out.println("Name erfolgreich geändert");
			name = na;
		}
	}
	//Beschränkung um realistische Raumschiffgröße zu ermöglichen
	public void setlaenge(int lae){
		if(lae>10){
			laenge = lae;
		}
	}
	//Beschränkung um realistische Raumschiffgröße zu ermöglichen
	public void setbreite(int bre){
		if(bre>10){
			laenge = bre;
		}
	}
	//Beschränkung da die Triebwerke für den Sprung in den Hyperraum aktiv sein müssen
	public void sethyperraum(boolean hy){
		if(triebwerke){
			hyperraum = hy;
		}
	}



	//Getmethode um auf Private Varible zuzugreifen
	public String getname(){
		return name;
	}
	//Getmethode um auf Private Varible zuzugreifen
	public int getlaenge(){
		return laenge;
	}
	//Getmethode um auf Private Varible zuzugreifen
	public int getbreite(){
		return breite;
	}
	//Getmethode um auf Private Varible zuzugreifen
	public boolean gethyperraum(){
		return hyperraum;
	}


	//Die Triebwerke werden gestartet
	void triebwerkeStarten(){
		triebwerke = true;
	}

	//Die Triebwerke werden ausgeschaltet
		void triebwerkeAusschalten(){
			triebwerke = false;
		}

	//Ein Hyperraumsprung wird ausgeführt
	void hyperraumsprung(){
		if(triebwerke){
			hyperraum=true;
			System.out.println("Hyperraumantrieb aktiviert!");
			System.out.println("\nSysteminfo: \nDas Raumschiff fliegt mit 1.079.252.820 km/h.\n");

		}
		
	}
	//Die Geschwindigkeit wird angezeigt
	double geschwindigkeit(){
		double geschwindigkeit = 0;
		if(triebwerke){
			double zufall = Math.random();

			geschwindigkeit=zufall*1000;
			geschwindigkeit = Math.round(geschwindigkeit);
		}
		return geschwindigkeit;
	}
	void selbstzerstoerung(){
		System.out.println("Bumm!");
	}


}
