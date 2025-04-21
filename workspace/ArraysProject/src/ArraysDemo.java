import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] months = {"Enero","Febrero","March","Abril",
				"Mayo","Junio","Julio","Agosto","Septiembre",
				"Octubre","Noviembre","Diciembre"};
		
		months = Arrays.copyOf(months, 13);
		
		months[12] = "Otroembre";
		System.out.println(months[12]);
		System.out.println(months.length);
//		for (int i = 0; i < months.length; i++) {
//			System.out.println(months[i]);
//		}//for i
		
		for (String month : months) {//La ventaja de este for es que no necesito saber cuántos elementos son, ni definir un contador
			System.out.println(month);
		}//foreach

	}//main

}//class ArraysDemo
