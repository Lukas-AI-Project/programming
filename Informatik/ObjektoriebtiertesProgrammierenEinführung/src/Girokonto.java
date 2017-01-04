
public class Girokonto {
	String kontobesitzer;
	double kontostand;
	String bank;
	double dispo;

	public Girokonto(String kb, double ks, String ba, double di){
		kontobesitzer = kb;
		kontostand = ks;
		bank = ba;
		dispo = di;
	}
	void einzahlen(double betrag){
		kontostand=kontostand+betrag;
	}
	void ueberweisen(Girokonto g,double betrag){
		double pruefsumme = g.kontostand-g.dispo;
		if (betrag<pruefsumme){
			g.kontostand=g.kontostand-betrag;
			kontostand=kontostand+betrag;
		}
		else{
			System.out.println("Ihr Dispo ist überzogen!!");
		}
	}
}
