//Lukas Schulz 1. Semester
import java.util.Scanner;
public class testklasseRaumschiff {
	public static void main(String[]args){
//Erstellung eines Raumschiff-Objekts mit dem Namen raumschiff1
		Raumschiff raumschiff1 = new Raumschiff("Outlander", 25, 25, false, false);
		double geschwindigkeit=0;
		System.out.println("Willkommen auf der Brücke Captain!\nDas Schiff erwartet ihre Befehle");
		Scanner sc = new Scanner(System.in);
		boolean zielkoordinatenTrue = false;
		String ziel = "";
		boolean schiffan = true;
//Befehle werden abgefragt
		while (schiffan){
			String befehl = sc.next();
			switch (befehl) {
				case "status":
					System.out.println("Name: "+raumschiff1.getname());
					System.out.println("Triebwerke: "+raumschiff1.triebwerke);
					System.out.println("Hyperraumantrieb: "+raumschiff1.gethyperraum());
					break;
				case "geschwindigkeit":
					geschwindigkeit=raumschiff1.geschwindigkeit();
					if (geschwindigkeit==0){
						System.out.println("Das Raumschiff steht ... -.-");
					}
					else{
						if(raumschiff1.gethyperraum()){
							System.out.println("Das Raumschiff fliegt mit 1.079.252.820 km/h.");
						}
						else{
							System.out.println("Das Raumschiff fliegt mit "+geschwindigkeit+" km/h.");
						}
					}
					break;
				case "triebwerkeStarten":
					raumschiff1.triebwerkeStarten();
					System.out.println("Triebwerke werden gestartet ...");
					System.out.println("Triebwerke sind aktiv");
					break;
				case "triebwerkeAusschalten":
					raumschiff1.triebwerkeAusschalten();
					System.out.println("Triebwerke werden ausgeschaltet ...");
					System.out.println("Triebwerke sind deaktiviert");
					break;
				case "hyperraumsprung":

					if (zielkoordinatenTrue && raumschiff1.triebwerke){
						raumschiff1.hyperraumsprung();
						System.out.println("Whuuuuush!\nWillkommen im Orbit von "+ziel);
					}
					else if(!zielkoordinatenTrue){
						System.out.println("Fehler! Geben sie zuerst einen Zielort ein!");
					}
					else if(!raumschiff1.triebwerke)
						System.out.println("Fehler! Triebwerke nicht aktiv!");
					break;
				case "selbstzerstörung":
					Scanner sz = new Scanner(System.in);
					System.out.println("Sicher? Zur Bestätigung 10-stelliges Passwort eingeben: ");
					String passwort = sz.next();
					if (passwort.equals("**********")){
						raumschiff1.selbstzerstoerung();
						schiffan=false;
					}
					else{
						System.out.println("Passwort inkorrekt!\nPhuu... das war knapp!");
					}
					sz.close();

					break;
				case "zielort":
					Scanner szi = new Scanner(System.in);
					System.out.println("Geben sie ihren Zielort ein: ");
					ziel = szi.next();
					switch (ziel) {
						case "Erde":
							System.out.println("Zielort '"+ziel+"' erfolgreich akzeptiert!");
							zielkoordinatenTrue=true;
							break;
						case "Mars":
							System.out.println("Zielort '"+ziel+"' erfolgreich akzeptiert!");
							zielkoordinatenTrue=true;
							break;
						case "Hoth":
							System.out.println("Zielort '"+ziel+"' erfolgreich akzeptiert!");
							zielkoordinatenTrue=true;
							break;
						case "Tatooine":
							System.out.println("Zielort '"+ziel+"' erfolgreich akzeptiert!");
							zielkoordinatenTrue=true;
							break;
						case "Corouscant":
							System.out.println("Zielort '"+ziel+"' erfolgreich akzeptiert!");
							zielkoordinatenTrue=true;
							break;
						case "Todesstern":
							System.out.println("Fehler! Zielort wurde leider zerstört");
							break;
						case "Mond":
							System.out.println("Zielort '"+ziel+"' erfolgreich akzeptiert!");
							zielkoordinatenTrue=true;
							break;
						default:
							System.out.println("Fehler! Zielort '"+ziel+"' nicht in der Datenbank vorhanden!");
							break;
						}
					break;
				case "ausschalten":
					schiffan=false;
					break;
			}
		}
		System.out.println("Schiff wurde ausgeschaltet!");
		sc.close();
	}
}