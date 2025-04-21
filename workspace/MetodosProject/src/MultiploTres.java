//https://github.com/jcgeneration/EjerciciosJavascript
import java.util.Scanner;

public class MultiploTres {

	public static void main(String[] args) {
		System.out.println("Ingresa un número entre el 100 - 200:  ");
		Scanner in = new Scanner(System.in);		
		int numero = in.nextInt();
		in.close();
		
		multiploTres(numero);

	}//main
	
	public static void multiploTres(int numero) {		
		if (numero%3 == 0){
			System.out.println("El número ingresado SÍ es múltiplo de 3");			
		} else {
			System.out.println("El número ingresado NO es múltiplo de 3");					
		}
	}//multiploTres
}//MultiploTres
