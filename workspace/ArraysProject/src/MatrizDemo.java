
public class MatrizDemo {

	public static void main(String[] args) {
		int [][] matriz = {
				{1,2,3,4,5},//[0]
				{6,7,8,9,10},//[1]
				{11,12,13,14},//[2]
		};//matriz
		
		System.out.println(matriz[1][4]);		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j] + " ");				
			}//for
			System.out.println();
		}//for
		
	}//main
		

}//MatrizDemo
