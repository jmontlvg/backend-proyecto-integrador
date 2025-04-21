import java.util.Scanner;

public class esSuma {

	public static void main(String[] args) {
		System.out.println("Ingresa el primer número:  ");
		Scanner in = new Scanner(System.in);		
		int primerNum = in.nextInt();
		System.out.println("Ingresa el segundo número:  ");
		int segundoNum = in.nextInt();
		System.out.println("Ingresa el tercer número:  ");
		int tercerNum = in.nextInt();
		suma(primerNum,segundoNum,tercerNum);
		in.close();			
		
	}//main
	
	public static void suma(int primerNum, int segundoNum, int tercerNum) {		
		if (primerNum == segundoNum + tercerNum){
			System.out.println("La suma de " + segundoNum + " y " + tercerNum + " es: " + primerNum);
		} else if (segundoNum == primerNum + tercerNum) {
			System.out.println("La suma de " + primerNum + " y " + tercerNum + " es: " + segundoNum);			
		} else if (tercerNum == primerNum + segundoNum) {
			System.out.println("La suma de " + primerNum + " y " + segundoNum + " es: " + tercerNum);
		} else {
			System.out.println("Ninguno de los números es la suma de los otros dos números");
		}
	}//suma
	
}//esSuma
