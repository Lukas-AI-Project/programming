import java.util.Scanner;
public class Benutzereingabe {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben sie ihren Namen ein: ");
		String name = sc.next();
		System.out.println("Bitte geben sie ihr Alter ein: ");
		int alter = sc.nextInt();
		System.out.println("Ihr Name ist "+name+" und sie sind "+alter+" LJahre alt.");
		sc.close();

	}
}
