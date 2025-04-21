
public class codigo6 {

	public static void main(String[] args) { // Se agrega el método 'main'
		 int n[] = {20}; // Se colocan los '[]' después de 'n'
		 // Se elimina el 'int' que estaba colocado antes de '[20]'
		 // Se cambian los corchetes '[]' que incluyen el número 20 por llaves '{}'

		    for (int i = 0; i < 20; i++) { // Se agrega el segundo '+' que hacía falta para el incremento
		      n[i] = (int)(Math.random() * 381) + 20;
		      System.out.println(n[i] + " "); // Se agrega el '.out' después de 'System'
		    }
		    
		    System.out.println("\n¿Qué números quiere resaltar? "); // Se agrega la 'l' de '.println'
		    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): "); // Se agrega la 'ln' de '.println'
		    int opcion = Integer.parseInt(System.console().readLine()); // Se agrega el ')' que faltaba después de '.readLine()'

		    int multiplo = (opcion == 1) ? 5 : 7; // Se cambia el orden de ': 5 ? 7', ya que es un operador ternario 

		    for(int e : n) { //Se elimina el 'foreach' y se coloca 'for'
		      if (e % multiplo == 0) {
		        System.out.print("[" + e + "] ");
		      } else { // Se agrega el '}' faltante después del if
		        System.out.print(e + " "); // Se cambia el '.in' por '.out'
		      } // Se agrega el '}' faltante después del else
		    } // Se agrega el '}' faltante después del foreach
	} //main
} //class codigo6
