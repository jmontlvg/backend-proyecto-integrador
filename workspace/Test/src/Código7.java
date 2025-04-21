import java.util.HashMap; // Se importa el java.util.HashMap
import java.util.Scanner; // Se importa el java.util.Scanner

public class Código7 {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in); // Se agrega el 'System.in' dentro del paréntesis

		    HashMap<String, String> capitales = new HashMap<>(); // Se cambia el nombre del HashMap por 'capitales'
		    // Se cambian el <Byte, Double> por <String, String>  

		    capitales.put("Canadá", "Otawwa");
		    capitales.put("Estados Unidos", "Washington DC");
		    capitales.put("México", "México DF");
		    capitales.put("Belice", "Belmopán");
		    capitales.put("Costa rica", "San José");
		    capitales.put("El Salvador", "San Salvador");
		    capitales.put("Guatemala", "Ciudad de Guatemala");
		    capitales.put("Honduras", "Tegucigalpa");
		    capitales.put("Nicaragua", "Managua");
		    capitales.put("Panamá", "Panamá");
		   
		    String c = ""; // Se escribe correctamente 'String'
		    do {
		      System.out.print("Escribe el nombre de un país y te diré su capital: "); // Se cambia '.in' por '.out'
		      c = s.nextLine(); // Se cambia '.nextDouble()' por '.nextLine()' ya que 'c' es un String 
		      
		      if (!c.equals("salir")) { // Se cambia 'equal' por 'equals'
		        if (capitales.containsKey(c)) { // Se cambia 'ca' por 'capitales' y 'containsValue' por 'containsKey'
		          System.out.println("La capital de " + c); // Se agrega el '.out' y 'ln'
		          System.out.println(" es " + capitales.get(c)); // Como queremos obtener el valor, se utiliza 'get'
		        } else {
		          System.out.print("No conozco la respuesta ");
		          System.out.print("¿cuál es la capital de " + c + "?: ");
		          String ca = s.nextLine();
		          capitales.put(c, ca); // Se cambia 'ca' por 'capitales'
		          System.out.println("Gracias por enseñarme nuevas capitales");
		        } // else
		      } // if
		    } while (!c.equals("salir")); // Se corrige 'wile' por 'while'
		    s.close(); // Cierra el Scanner

	} // main

} // Código7
