import java.util.Scanner;
public class Aufgabe3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben sie eine Zahl ein:");
		int zahl1 = sc.nextInt();
		System.out.println("Geben sie noch eine Zahl ein:");
		int zahl2 = sc.nextInt();
		int ergebnis = zahl1+zahl2;
		System.out.println("Die Summe der Zahlen beträgt "+ergebnis);

	}
}
