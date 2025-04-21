package org.generation.threads.hilos;

//En esta clase vamos a extender de la clase Thread.
public class HiloHeredado extends Thread {
	
	//Creamos un método void run(); para que la clase pueda ejecutar el subproceso.
	//Dentro del método escribo el bloque de código a ejecutar
	//Al ser un método perteneciente a la clase Thread debo anotarlo como método que
	//se sobreescribe (@Override)
	
	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) { 
			System.out.println("Primer hilo, clase Thread → " + i);
		}
	}
	
}//class HiloHeredado
