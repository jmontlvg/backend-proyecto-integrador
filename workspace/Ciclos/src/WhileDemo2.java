//Se añaden 'break' y 'continue'
public class WhileDemo2 {

	public static void main(String[] args) {
		int cont = 5;
		while(cont <= 100) {
			if(cont > 50)
				break;
			System.out.println(cont);
			cont+=5;
		}//while
		System.out.println("----------------------------");
		int cont2 = 100;
		while(cont2 >= 5) {
			if(cont2 == 50) {
				cont2-=5;
				continue;
			}//if
			System.out.println(cont2);
			cont2-=5;
		}//while
	}//main
}//WhileDemo


