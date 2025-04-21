
public class MethodsDemo {

	public static void main(String[] args) {
//		MethodsDemo operaciones = new MethodsDemo();
//		System.out.println(operaciones.sum(14,56));
		System.out.println(MethodsDemo.sum(16,54)); //Método de clase con static en la definición
		System.out.println(MethodsDemo.sum(16,54,13));
		System.out.println(MethodsDemo.sum((float)16.5,54f));
		System.out.println(capitalize("COHORTE 49"));//Generation
	}//main
	//Un método de clase solo lo puedo usar dentro de la clase
	
	public static int sum(int a, int b) {//definición de método de clase
	//public int sum(int a, int b){ //definición de método de instancia
		return a + b;
	}//sum 
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}//sum

	public static float sum(float a, float b) {
		return a + b;
	}//sum
	
	public static String capitalize(String str) {		
		str = str.toLowerCase();
		return str.substring(0,1).toUpperCase() + str.substring(1);
		
		
	}//capitalize
	
}//class MethodsDemo
