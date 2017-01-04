
public class ArraysAufgabe2a {
	public static void main(String[] args){
		double geld = 2500;


		double[] kontostand = new double [11];
		for (int i = 0; i < kontostand.length; i++){
			kontostand[i]= geld;
			geld = geld * 1.007;

		}


		geld = 2500;
		double[] kontostand2 = new double [11];
		for (int i = 0; i < kontostand2.length; i++){
			if (i==0){
				kontostand2[i]= geld;
			}
			else if (i==1){
				geld = geld * 1.01;
				kontostand2[i]= geld;
			}
			else{
				geld = geld * 1.0035;
				kontostand2[i]= geld;
			}
		}

		geld = 2500;
		double[] kontostand3 = new double [11];
		for (int i = 0; i < kontostand3.length; i++){
			if (i==0){
				geld=geld+25;
				kontostand3[i]= geld;
			}

			else{
				geld = geld * 1.0065;
				kontostand3[i]= geld;
			}
		}


		for (int i = 0; i< kontostand.length; i++){
			System.out.println("Der Konotstand nach "+i+" Jahren beträgt "+kontostand[i]);
		}
		for (int i = 0; i< kontostand2.length; i++){
			System.out.println("Der 2. Konotstand nach "+i+" Jahren beträgt "+kontostand2[i]);
		}
		for (int i = 0; i< kontostand3.length; i++){
			System.out.println("Der 3. Konotstand nach "+i+" Jahren beträgt "+kontostand3[i]);
		}




	}

}
