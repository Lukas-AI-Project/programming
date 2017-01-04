import java.util.Scanner;
public class Aufgabe2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String passwort = "i<3Rainbows";
		System.out.println("Bitte geben sie das Passwort ein: ");
		String passwortInput = sc.next();
		sc.close();
		boolean pwtest = passwort.equals(passwortInput);
		if (pwtest) {
			System.out.println("Passwort korrekt. Leite Zündsequenz ein ...");
		}else {
			System.out.println("Passwort inkorrekt");
		}
	}

}
