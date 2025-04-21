import java.util.Scanner;

public class SwitchDemo4 {

	public static void main(String[] args) {
		System.out.print("Escribe el número del mes: ");
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();		
		String monthString = ""; // Declarar la variable	
		
		switch(month) {
			case 1,3,5,7,8,10,12: 
				System.out.println(31);
				break;
			case 2: 
				System.out.println("28/29");
				break;
			case 4:
			case 6:
			case 9:
			case 11: 
				System.out.println(30);
				break;			
			default: monthString = "Invalid month";
				break;		
		}//switch
		System.out.println(monthString);		
		in.close();
	}//main
}//class SwitchDemo
