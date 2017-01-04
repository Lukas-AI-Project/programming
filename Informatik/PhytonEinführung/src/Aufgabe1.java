import java.util.Scanner;


public class Aufgabe1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben sie ihren Namen ein: ");
		String name = sc.next();
		System.out.println("Guten Tag "+name+"!");
		sc.close();

	}

}
