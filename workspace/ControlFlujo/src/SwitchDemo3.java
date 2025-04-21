import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		System.out.print("Escribe el número del mes: ");
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();		
		String monthString = ""; // Declarar la variable	
		
		switch(month) {
			case 1: System.out.println(31);
				break;
			case 2: System.out.println("28/29");
				break;
			case 3: System.out.println(31);
				break;
			case 4: System.out.println(30);
				break;
			case 5: System.out.println(31);
				break;
			case 6: System.out.println(30);
				break;
			case 7: System.out.println(31);
				break;
			case 8: System.out.println(31);
				break;
			case 9: System.out.println(30);
				break;
			case 10: System.out.println(31);
				break;
			case 11: System.out.println(30);
				break;
			case 12: System.out.println(31);
				break;
			default: monthString = "Invalid month";
				break;		
		}//switch
		System.out.println(monthString);		
		in.close();
	}//main
}//class SwitchDemo
