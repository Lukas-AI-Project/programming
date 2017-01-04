import java.util.Scanner;


public class Aufgabe4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int zahl = 22;

		System.out.println("Raten sie eine Zahl zwischen 1 und 40:");
		int eingabe = sc.nextInt();
		if (zahl==eingabe){
			System.out.println("Richtig");
		}else{
			System.out.println("Falsch! Raten sie nochmal:");
		}

		eingabe = sc.nextInt();
		if (zahl==eingabe){
			System.out.println("Richtig");
		}else{
			System.out.println("Falsch! Raten sie nochmal:");
		}

		eingabe = sc.nextInt();
		if (zahl==eingabe){
			System.out.println("Richtig");
		}else{
			System.out.println("Falsch! Raten sie nochmal:");
		}

		eingabe = sc.nextInt();
		if (zahl==eingabe){
			System.out.println("Richtig");
		}else{
			System.out.println("Falsch! Raten sie nochmal:");
		}

		eingabe = sc.nextInt();
		if (zahl==eingabe){
			System.out.println("Richtig");
		}else{
			System.out.println("Falsch! Sie haben verloren");
		}


	}
}
