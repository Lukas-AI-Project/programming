
public class Boot extends Fahrzeug {
	private double ankerGewicht;

	public Boot() {
	}

	public Boot(int p, boolean i, String a, double an) {
		super(p, i, a);
		ankerGewicht = an;
	}

	// Getter und Setter
	public double getAnkerGewicht() {
		return ankerGewicht;
	}

	public void setAnkergewicht(double an) {
		ankerGewicht = an;
	}

	// Methode
	public void neuerAnker(double an) {
		ankerGewicht = an;
		System.out.println("Der Anker wurde gewechselt");
	}
}
