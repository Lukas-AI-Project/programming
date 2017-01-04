
public class TestklasseFahrzeuge {
	public static void main(String[]args){
		Auto auto1 = new Auto(222, false, null, 300);
		Boot boot1 = new Boot(500, true, "Kaan", 25);
		Fahrzeug[] fahrzeuge = new Fahrzeug[5];
		fahrzeuge[0] = auto1;
		fahrzeuge[1] = boot1;
		System.out.println("Reifendruck Auto1: "+fahrzeuge[0].getPs());
		System.out.println("Ausleiher Boot1: "+fahrzeuge[1].getAusleiher());
	}
}