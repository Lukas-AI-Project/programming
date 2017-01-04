
public class ArraysAufgabe1c {
	public static void main(String[] args){
		boolean durchVier[] = new boolean[100];
		for (int i = 0; i<100; i++){
			boolean modulo;
			if(i%4==0){
				modulo = true;
			}
			else{
				modulo = false;
			}
			durchVier[i]= modulo;
		}
		for (int j = 0; j< durchVier.length; j++){
			System.out.println(durchVier[j]);
		}


	}
}
