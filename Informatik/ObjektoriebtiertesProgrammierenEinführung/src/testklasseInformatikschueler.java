//Lukas Schulz 1. Semester
public class testklasseInformatikschueler {
	public static void main(String[] args){
		//Erstellung eines Informatikschüler-Objekts mit dem Namen schueler1
		InformatikSchueler schueler1 = new InformatikSchueler(50, 30, 20);

		//Ausgabe der aktuellen Informationen über den Schüler
		System.out.println("Note: "+schueler1.informatikNote);
		System.out.println("Müdigkeit: "+schueler1.muedigkeit);
		System.out.println("Zufriedenheit: "+schueler1.zufriedenheit);
		System.out.println("");



		//Methode lernen auf dem Objekt schueler1 aufrufen
		schueler1.lernen();

		System.out.println("Lernen: ");

		//Ausgabe der aktuellen Informationen über den Schüler
		System.out.println("Note: "+schueler1.informatikNote);
		System.out.println("Müdigkeit: "+schueler1.muedigkeit);
		System.out.println("Zufriedenheit: "+schueler1.zufriedenheit);
		System.out.println("");

		//Methode programmieren auf dem Objekt schueler1 aufrufen
		schueler1.programmieren();

		System.out.println("Programmieren: ");

		//Ausgabe der aktuellen Informationen über den Schüler
		System.out.println("Note: "+schueler1.informatikNote);
		System.out.println("Müdigkeit: "+schueler1.muedigkeit);
		System.out.println("Zufriedenheit: "+schueler1.zufriedenheit);
		System.out.println("");

		//Methode programmieren auf dem Objekt schueler1 aufrufen
		schueler1.hobbyBetreiben();

		System.out.println("hobbyBetreiben: ");

		//Ausgabe der aktuellen Informationen über den Schüler
		System.out.println("Note: "+schueler1.informatikNote);
		System.out.println("Müdigkeit: "+schueler1.muedigkeit);
		System.out.println("Zufriedenheit: "+schueler1.zufriedenheit);
		System.out.println("");

		//Methode berechneNote auf dem Objekt schueler1 aufrufen
		//und den Wert informatikNote als Übergabeparameter angeben
		int note = schueler1.berechneNote(schueler1.informatikNote);
		System.out.println("Der Informatikschüler hat die Note: "+note);

	}
}
