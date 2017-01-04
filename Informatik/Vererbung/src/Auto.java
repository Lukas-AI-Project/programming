
public class Auto extends Fahrzeug {
	private double reifendruck;

	public Auto() {
	}

	public Auto(int p, boolean i, String a, double rd) {
		super(p, i, a);
		reifendruck = rd;
	}

	// Getter und Setter
	public double getreifendruck() {
		return reifendruck;
	}

	public void setReifendruck(double rd) {
		reifendruck = rd;
	}

	// Methode
	public void reifenAufpumpen(double rd) {
		reifendruck = rd;
		System.out.println("Der Reifen wurde aufgepumpt");
	}
}
