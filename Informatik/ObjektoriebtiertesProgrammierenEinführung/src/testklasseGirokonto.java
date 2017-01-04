import java.util.Scanner;
public class testklasseGirokonto {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Girokonto konto1 = new Girokonto("Lukas", 7500, "Sparkasse", -500);
		konto1.einzahlen(12.5);
		Girokonto konto2 = new Girokonto("Kaan", 600, "Sparkasse", -500);
		konto2.einzahlen(12.5);

		System.out.println("Konotstand 1: "+konto1.kontostand);
		System.out.println("Konotstand 2: "+konto2.kontostand);
		double betrag = sc.nextDouble();

		konto1.ueberweisen(konto2, betrag);
		System.out.println("Konotstand 1: "+konto1.kontostand);
		System.out.println("Konotstand 2: "+konto2.kontostand);
		sc.close();
	}
}
