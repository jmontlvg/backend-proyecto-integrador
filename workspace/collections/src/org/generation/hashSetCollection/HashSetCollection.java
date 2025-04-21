package org.generation.hashSetCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetCollection {
	public static void main (String[] args) {
		
		//-----HashSet-----
		//Los HashSet son respaldados por las tablas Hash, donde los 
		//elementos se recuperan mediante la optimización de memoria.
		//Los elementos se muestran de manera desordenada.
		//No muestra elementos duplicados.
		
		HashSet<String> productos = new HashSet<>();//Si yo dejo vacío el diamante no hay problema
		//Java lo detecta.
		
		productos.addAll(Arrays.asList("iPhone","iWatch","Kindle","Samsung tab","Alexa","Smartwatch","iPhone","Nokia","Chromebook","iPad","Lavasecadora Bespoke AI"));
		System.out.println(productos);
		System.out.println(productos.size()); //OP: 10 → Este método .size() es transversal y por eso se puede
		//utilizar en HashSet
		
		//Conocer si un elemento se encuentra dentro del HashSet .contains(value);		
		System.out.println(productos.contains("iPad"));//OP: true
		System.out.println(productos.contains("ipad"));//OP: false
		
		//Limpiar el HashSet .clear();
		productos.clear();
		System.out.println(productos);//OP: []
		
		//-----TreeSet-----
		//Los elementos se encuentran ordenados de menor a mayor (manera natural)
		//No permite duplicados
		
		TreeSet<Double> precios = new TreeSet<Double>();
		precios.addAll(Arrays.asList(19845.00d,3547.50d,10d,14649.99d,255.50d,1449.50d,10d,58550d));
		
		System.out.println(precios);
		//Método comparator
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Comparator.html
		
		
	}//main

}//HashSetCollection
