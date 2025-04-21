import java.util.Scanner;//Se agrega el java.util.Scanner

public class Codigo5 {
	
	public static void main (String[] args){//Se agrega el método principal → public static void main

	    Scanner s = new Scanner(System.in );
	    System.out.print("Introduzca un número: ");//Se agrega la doblec comilla del final
	    String ni = s.nextLine();//Aquí se entiende que se lee como String
	    int c = Integer.parseInt(ni);//Aquí entonces, se cambia el tipo de dato de String a int
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) {//Aquí 'ni' se cambia por 'c', ya que c es justamente el String que se cambió a int para poder ser usado en el ciclo
		  int digito = (int)(c % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      }//Se agrega llave faltante de este 'if'
		  
		  c /= 10;//Nuevamente 'ni' se cambia por 'c' porque es un int
	    }//while
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }//if
	    s.close();//Se cierra el Scanner
	  }//main	
}//class Codigo5


