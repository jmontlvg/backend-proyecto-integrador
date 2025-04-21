package org.generation.arrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListJava {
	// 'String[] args' es un 'array' inicializado donde 'args' es el nombre
	// de mi array
	public static void main(String[] args) { // El método 'main' se utiliza
		// para debuggear o probar nuestro código
		
		// --- Arrays → En Java los 'arrays' solo deben tener un mismo
		// tipo de dato.
		
		String[] nombre = {"Mario","Erick","Sofy","Lizbeth"};
		int[] codigoPostal = {18551,12668,25636,86000};
		double[] salarios = {12355.25d,28933.12d,14877.05d,54732.15d};
		// Cada array es unidimensional
		
		// Imprimir array de manera directa
		// System.out.println(nombre);
		
		// Imprimir un Array utilizando un ciclo for (en forma de lista)
		for(int i = 0; i < salarios.length; i++) {
			System.out.println(salarios[i]);
		}
		
		// Imprimir un Array utilizando un ciclo for-each (en forma de lista)
		for(int codigo : codigoPostal) {
			System.out.println(codigo);
		}
		
		// Imprimir un Array utilizando un método de Arrays
		System.out.println(Arrays.toString(nombre));
		
		// Acceder a un elemento del Array
		String nombre1 = nombre[0];
		System.out.println("El primer nombre del Array es: " + nombre1);
		
		// Acceder al último elemento del Array
		String ultimoNombre = nombre[nombre.length - 1];
		System.out.println("El último nombre del Array es: " + ultimoNombre);
		
		// Inicializando un Array definiendo el número de elementos
		char[] simbolos = new char[3];
		simbolos[0] = '@';
		simbolos[1] = '*';
		simbolos[2] = '#';
		// simbolos[3] = '/'; Al agregar este elemento, me causa una Exception
		
		System.out.println(Arrays.toString(simbolos));
		
		// ----------------ArrayList----------------
		// 1. Los ArrayList son una estructura de datos y en el contexto de 
		// Java son una clase.
		// 2. Pueden modificar su longitud según sea necesario.
		// 3. Permiten elementos duplicados.
		// 4. Trabajan con clases Wrapper.
		
		// Si yo inicio el ArrayList desde la clase siempre será ArrayList
		// Inicializando un ArrayList desde la Class
		ArrayList<String> peliculas = new ArrayList<String>();
		
		// Agregar elementos al ArrayList.add();
		peliculas.add("Interstellar");
		peliculas.add("El castillo vagabundo");
		peliculas.add("Joker 2");
		peliculas.add("Barbie y el cascanueces");
		peliculas.add("interstellar");
		peliculas.add("Somewhere in time");
		peliculas.add("Mulán");
		peliculas.add("The proposal");
		peliculas.add("Érase una vez en Hollywood");
		peliculas.add("Dr Strangelove");
		
		System.out.println(peliculas);
		
		// Si yo lo inicio desde la interface, puede cambiar
		// Inicializando un ArrayList desde la interface
		List<Double> salariosDevelopers = new ArrayList<Double>();
		
		// Agregar elementos al ArrayList utilizando Arrays y el método asList()
		salariosDevelopers.addAll(Arrays.asList(28145.33d,47556.11d,16705.98d,25366.24d,25674.48d));
		
		System.out.println(salariosDevelopers);
		
		// Conocer el tamaño de un ArrayList .size();
		System.out.println(peliculas.size()); // Output: 10
		
		// Acceder a un elemento específico del ArrayList a partir de su
		// índice .get(index);
		System.out.println(peliculas.get(5)); // Output: Somewhere in time
		
		// Acceder al último elemento del ArrayList .size() - 1
		System.out.println(peliculas.get(peliculas.size() - 1));
		
		// Modificar un elemento del ArrayList a partir de su index .set(index, newElement);
		peliculas.set(2, "Coach Carter"); // Hice la modificación de la película Joker 2 por Coach Carter
		
		System.out.println(peliculas.get(2));
 		
		peliculas.add("Pinocho"); // Agregamos una nueva película
		
		System.out.println(peliculas);
		
		System.out.println(peliculas.size());
		
		// Eliminar un elemento mediante su index
		// En este caso, voy a eliminar el último elemento
		
		peliculas.remove(peliculas.size() - 1);
		System.out.println(peliculas.size()); // Output:10
		System.out.println(peliculas); // No aparece la película Pinocho porque se eliminó
		
		// Ordenando el ArrayList tomando como base la tabla ASCII. Para ello utilizamos
		// Collections y el método .sort();
		Collections.sort(peliculas);
		System.out.println(peliculas);
		
		// Invertir ArrayList
		Collections.reverse(peliculas);
		System.out.println(peliculas);
		
		// Cambiando el tipo de estructura de datos
		// peliculas = new LinkedList<String>(); No podemos convertir de un ArrayList a un LinkedList
		// porque 'peliculas' se inicializó desde la clase ArrayList
		// Los LinkedList son estructuras de datos lineales que almacenan sus elementos en nodos
		salariosDevelopers = new LinkedList<>(); // Sí se puede convertir de ArrayList a LinkedList porque
		// se inicializó desde la interface list
		
		System.out.println(peliculas.getClass().getSimpleName()); //OP: ArrayList
		System.out.println(salariosDevelopers.getClass().getSimpleName()); //OP: LinkedList
		
	} // main

} // ArrayListJava
