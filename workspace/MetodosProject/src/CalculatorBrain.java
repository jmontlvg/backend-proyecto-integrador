//https://github.com/generation-org/JAVA/tree/master/Functions
public class CalculatorBrain {

	public static void main(String[] args) {
		System.out.println(CalculatorBrain.addition(2,4)); 
		System.out.println(CalculatorBrain.substraction(2,4));
		System.out.println(CalculatorBrain.multiplication(2,4)); 
		System.out.println(CalculatorBrain.division(2,4));

	}//main
	
	public static float addition(float a, float b) {		
		return a + b;
	}//addition
	public static float substraction(float a, float b) {		
		return a - b;
	}//addition
	public static float multiplication(float a, float b) {		
		return a * b;
	}//addition
	public static float division(float a, float b) {		
		return a / b;
	}//addition

}//class CalculatorBrain
