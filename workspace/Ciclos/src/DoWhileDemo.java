
public class DoWhileDemo {

	public static void main(String[] args) {
		int cont = 5;		
		do {
			System.out.println(cont);;
			cont+=5;
		}while(cont <= 100);//DoWhile
		System.out.println("========================");
		cont = 100;
		do {
			System.out.println(cont);;
			cont-=5;
		}while(cont >= 5);//DoWhile

	}//main

}//DoWhileDemo
