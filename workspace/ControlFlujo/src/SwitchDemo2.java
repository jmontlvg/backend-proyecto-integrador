import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		System.out.print("Escribe el número del mes: ");
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		//Switch de expresión agregado a partir de la versión 14 de Java		
		
		String monthString = switch (month) {
			case 1 -> "January";
			case 2 -> "February";
			case 3 -> "March";
			case 4 -> "April";
			case 5 -> "May";
			case 6 -> "June";
			case 7 -> "July";
			case 8 -> "August";
			case 9 -> "September";
			case 10 -> "October";
			case 11 -> "November";
			case 12 -> "December";
			default -> "Invalid month";
		};
		System.out.println(monthString);		
		in.close();
	}//main
}//class SwitchDemo
