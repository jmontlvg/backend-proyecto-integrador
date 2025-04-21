import java.util.Scanner;
public class IfElseDemo {
	public static void main(String[] args) {
		System.out.print("Escribe el número de tu calificación: ");
		Scanner in = new Scanner(System.in);
		int testScore = in.nextInt();
		char grade;
		if (testScore >= 90) {
			grade = 'A';
		} else if (testScore >= 80) {
			grade = 'B';
		} else if (testScore >= 70) {
			grade = 'C';
		} else if (testScore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}//if-else
		System.out.println("Grade = " + grade);				
				
		in.close();
	}//main

}//class IfElseDemo
