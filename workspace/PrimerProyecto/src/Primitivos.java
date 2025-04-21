
public class Primitivos {
	public static void main(String[] args) {
		// TODO Definir variables de los 8 tipos de datos primitivos
		// Para definir una variable se utiliza el
		// tipo de dato seguido del nombre de la variable
		
		byte edad = 20;//Solo acepta desde -128 a 127
		short llamadaTelefonica;//Almacenan valores más grandes que el byte
		char letra = 'A';//Debe ser solo un caracter
		boolean isValid = false;//true;
		
		llamadaTelefonica = 5550;//Es un entero muy grande para almacenarlo en un byte
		
		int sumaEdades = edad;
		long sumaLlamadas = llamadaTelefonica;
		
		//El 'cast' es la conversión explícita. No solo funciona con datos primitivos, sino también con clases
		byte resultadoEdades = (byte)sumaEdades;
		
		System.out.println(resultadoEdades);
		
		System.out.println(letra);
		System.out.println(edad);
		System.out.println(llamadaTelefonica);
		
		
		
		//byte
		//short
		//int
		//long
		//char: un espacio también puede ser un char
		//float
		//double
		//boolean

	}//main

}//class Primitivos
