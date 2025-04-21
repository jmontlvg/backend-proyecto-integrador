import java.util.Scanner;

public class Commission {

	public static void main(String[] args) {
		System.out.print("Ingrese las ventas: ");
		Scanner in = new Scanner(System.in);
		float sales = in.nextInt();
		float commission;
		// long tmp = 100_654_987_654L;
		
		if (sales > 10000) {
			commission = (float) (sales * 0.30);
		} else if (sales >= 5001 && sales <= 9999) {
			commission = sales * 0.20f;//esta forma (0.20f) es más eficiente, al utilizar menos recursos
		} else if (sales >= 1001 && sales <= 4999) {
			commission = (float) (sales * 0.10);
		} else {
			commission = sales * 0;
		}//if-else	
		System.out.println("La comisión del vendedor es= " + commission);			
		in.close();
	}//main

}//class Commission
