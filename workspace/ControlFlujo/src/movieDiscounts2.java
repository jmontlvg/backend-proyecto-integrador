import java.util.Scanner;

public class movieDiscounts2 {

	public static void main(String[] args) {
		System.out.print("Ingrese la edad del usuario: ");		
		Scanner in = new Scanner(System.in);
		byte edad = in.nextByte();
		//System.out.print("Ingrese el número de tickets a comprar: ");
		//byte numTickets = in.nextByte();
		byte normalTicket = 7;		
		double precioFinal;
				
		if (edad > 60) {
			precioFinal = normalTicket * 0.45;
		} else if (edad < 5) {
			precioFinal = normalTicket * 0.4 ;
		} else {
			precioFinal = normalTicket;
		}//if-else
		System.out.println("El precio final a pagar es = " + precioFinal);		
		in.close();
	}//main
}//class Commission
