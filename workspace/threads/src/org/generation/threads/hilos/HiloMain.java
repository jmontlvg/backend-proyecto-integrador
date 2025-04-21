package org.generation.threads.hilos;

public class HiloMain {
	
	public static void main(String[] args) {
		//Instanciar objetos de los subprocesos
		
		HiloHeredado hiloHeredado = new HiloHeredado();
		//Instanciando el objeto que implementa la Interface
		Thread hiloImplementado = new Thread(new HiloImplementado());
		
		//Ejecutar los subprocesos mediante el método 
		hiloHeredado.start();
		hiloImplementado.start();
		
	}

}
