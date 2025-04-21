//https://github.com/jcgeneration/EjerciciosJavascript
import java.util.Scanner;

public class EjercicioFunciones {

	public static void main(String[] args) {
		System.out.println("Ingresa el primer número entre el 1 - 100:  ");
		Scanner in = new Scanner(System.in);		
		int primerNum = in.nextInt();
		System.out.println("Ingresa el segundo número entre el 1 - 100:  ");
		int segundoNum = in.nextInt();
		System.out.println("Ingresa el tercer número entre el 1 - 100:  ");
		int tercerNum = in.nextInt();
		numMayor(primerNum,segundoNum,tercerNum);
		numMenor(primerNum,segundoNum,tercerNum);
		in.close();		
		
	}//main
	
	public static void numMayor(int primerNum, int segundoNum, int tercerNum) {		
		if (primerNum > segundoNum && primerNum > tercerNum){
			System.out.println("El número mayor ingresado es: " + primerNum);
		} else if (segundoNum > primerNum && segundoNum > tercerNum) {
			System.out.println("El número mayor ingresado es: " + segundoNum);	
		} else {
			System.out.println("El número mayor ingresado es: " + tercerNum);
		}
	}//numMayor
	
	public static void numMenor(int primerNum, int segundoNum, int tercerNum) {		
		if (primerNum < segundoNum && primerNum < tercerNum){
			System.out.println("El número menor ingresado es: " + primerNum);
		} else if (segundoNum < primerNum && segundoNum < tercerNum) {
			System.out.println("El número menor ingresado es: " + segundoNum);			
		} else {
			System.out.println("El número menor ingresado es: " + tercerNum);
		}
	}//numMenor
	
}//EjercicioFunciones
