package org.generation.threads.hilos;

public class HiloImplementado implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) { 
			System.out.println("Segundo hilo, interface Runnable → " + i);
		}
	}

}//HiloImplementado