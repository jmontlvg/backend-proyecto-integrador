package org.generation.iterator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Iterador {

	public static void main(String[] args) {
		/*
		 * Crear una colección que guarde los diferentes códigos de productos. Los
		 * códigos deben ser únicos y no son secuenciales.
		 */
		
		HashSet<Integer> codigosProductos = new HashSet<>();
		
		codigosProductos.addAll(Arrays.asList(20248596, 20243699, 20241852, 20248596, 20241654, 20240012,
				20243396, 20241234));
		
		//Recorrer un HashSet mediante un ciclo forEach
		/*for (Integer codigo : codigosProductos) {
			System.out.println(codigo);
		}*/
		
		/*
		 * Implementando la interface Iterator. Para ello instanciamos un objeto de tipo
		 * Iterador indicando el tipo de clase Wrapper con el que vamos a trabajar.
		 */
		Iterator<Integer> iterador = codigosProductos.iterator();
		
		/*
		 * Apoyándonos de un ciclo while, implementamos otros métodos de Iterator que nos
		 * van a permitir recorrer la Collection y mostrar cada elemento
		 */
		//hasNext(); Devuelve true si existen más elementos en la colección
		//next(); Devuelve el siguiente elemento en la iteración
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}//while
		
		//-------------------------------------------------------------------
		
		/*
		 * Crear un HashMap de salarios que perciben Employee. Solo podemos mostrar
		 * un salario por Employee
		 */
		HashMap<String, Double> salariosEmpleados = new HashMap<>();
		salariosEmpleados.put("Isaac", 43255d);
		salariosEmpleados.put("Diego", 36788.12d);
		salariosEmpleados.put("Marco", 45966.55d);
		salariosEmpleados.put("Wendy", 74699.13d);
		salariosEmpleados.put("Kemble", 61263.12d);
		
		//Iterar sobre la clave (key) del par key-value
		Iterator<String> iterarEmpleados = salariosEmpleados.keySet().iterator();
		
		while (iterarEmpleados.hasNext()) {
			System.out.println(iterarEmpleados.next());
		}
		//Iterar sobre el valor (value) del par k-v
		

	}//main

}//Iterador
