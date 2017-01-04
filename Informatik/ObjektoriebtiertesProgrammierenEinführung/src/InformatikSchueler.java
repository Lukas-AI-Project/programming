//Lukas Schulz 1. Semester
public class InformatikSchueler {
	//Deklarierung der Instanzvariablen
	int informatikNote	; //Prozentwert zwischen 0 und 100
	int muedigkeit ;     //Wert zwischen 0 und 100
	int zufriedenheit;   //Wert zwischen 0 und 100

	//Konstruktor der Klasse InformatikSchueler
	public InformatikSchueler(int in, int mu, int zu){
		informatikNote = in;
		muedigkeit = mu;
		zufriedenheit = zu;
	}
	//Methoden der Klasse InformatikSchueler

	//lernen: Der Schüler lernt um sich weiterzubilden und seine Note zu verbessern wird aber auch müder
	void lernen(){
		muedigkeit=muedigkeit+15;
		informatikNote=informatikNote+5;
	}

	//programmieren: Der Schüler programmiert etwas und strengt dabei seinen Kopf an und wird müder.
	//Bei Erfolg steigt, bei Misserfolg sinkt die Zufridenheit
	void programmieren(){
		double zufall = Math.random();
		//System.out.println(zufall);
		if (zufall<0.5){
			zufriedenheit=zufriedenheit+10;
			muedigkeit=muedigkeit-5;
			//System.out.println("Erfolg");
		}
		if (zufall>=0.5){
			zufriedenheit=zufriedenheit-10;
			muedigkeit=muedigkeit+5;
			//System.out.println("Misserfolg");
		}
	}

	//hobbyBetreiben: der Schüler macht etwas was ihm Spaß macht, die Zufriedenheit steigt
	void hobbyBetreiben(){
		zufriedenheit=zufriedenheit+10;
	}

	//schlafen: Der Schüler schläft, er verliert an Müdigkeit
	void schlafen(){
		muedigkeit=0;
	}

	//Die Note des Schülers wird berechnet
	int berechneNote(int zahl){
		int note = 0;
		if (zahl>=87){
			note=1;
		}
		if (zahl>=73&&zahl<=86){
			note=2;
		}
		if (zahl>=59&&zahl<=72){
			note=3;
		}
		if (zahl>=45&&zahl<=58){
			note=4;
		}
		if (zahl>=24&&zahl<=44){
			note=5;
		}
		if (zahl<24){
			note=6;
		}

		return note;
	}
}
