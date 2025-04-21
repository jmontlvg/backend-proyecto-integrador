//https://github.com/jcgeneration/EjerciciosJavascript
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		System.out.println("Ingresa un número entero:  ");
		Scanner in = new Scanner(System.in);		
		int numero = in.nextInt();
		in.close();
		
		esPar(numero);

	}//main
	
	public static void esPar(int numero) {		
		if (numero%2 == 0){
			System.out.println("El número ingresado SÍ es par");			
		} else {
			System.out.println("El número ingresado NO es par");					
		}
	}//par
}//ParImpar
