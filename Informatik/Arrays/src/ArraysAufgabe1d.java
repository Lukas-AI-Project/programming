import java.util.Scanner;
public class ArraysAufgabe1d {
	public static void main(String[] args){
		int noten[] = new int[6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<noten.length; i++){

			int anzahl = sc.nextInt();
			noten[i]=anzahl;



		}
		for (int i = 0; i< noten.length; i++){
			System.out.println(noten[i]);
		}
		sc.close();
	}

}
