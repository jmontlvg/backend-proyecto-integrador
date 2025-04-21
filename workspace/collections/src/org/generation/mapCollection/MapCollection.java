package org.generation.mapCollection;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
	public static void main(String[] args) {
		//-----HashMap-----
		//Almacena los datos en forma de pares de clave-valor (key-value)
		//No es ordenado
		//No permite datos duplicados
		
		Map<Long, String> estudiantes = new HashMap<Long, String>();
		
		//Agregar elementos (k/v) a mi HashMap .put();
		estudiantes.put(20250101L, "Victor Duran");
		estudiantes.put(20250102L, "Wendy Meneses");
		estudiantes.put(20250103L, "Carmen Garcia");
		estudiantes.put(20250104L, "Adrian Camacho");
		estudiantes.put(20250105L, "Eric Martinez");
		
		System.out.println(estudiantes);
		
		//Recorrer un HashMap utilizando un ciclo forEach
		for (Map.Entry<Long, String>estudiante : estudiantes.entrySet()) {
			System.out.println("Matricula :" + estudiante.getKey() + ". Nombre: " + estudiante.getValue());					
		}//for
		
		//Recuperar el valor (value) de una clave (key) utilizando el método .get(key)
		Long matricula01 = 20250101L;
		String estudiante01 = estudiantes.get(matricula01);
		System.out.println("El estudiante con la matrícula " + matricula01 + " es " + estudiante01);//OP: Victor Duran
		
		//estudiantes.clear();//Limpia el HashMap
		
		//Eliminar un elemento (K-V)
		estudiantes.remove(matricula01);
		System.out.println(estudiantes);
		
		
	}//main

}//MapCollection
