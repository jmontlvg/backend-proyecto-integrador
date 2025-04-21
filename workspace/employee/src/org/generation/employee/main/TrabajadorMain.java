package org.generation.employee.main;

import java.util.List;

import org.generation.employee.model.Employee;
import org.generation.employee.model.Manager;
import org.generation.employee.model.Trabajador;

public class TrabajadorMain {
	public static void main (String[] args) {
		Trabajador trabajador01 = new Employee(1L,"Daniel","Maldonado",38,"Instructor",22363d);
		Trabajador trabajador02 = new Manager(1L, "Juan Carlos", "Valencia", 42, 74256.22d, 5000d);
		Trabajador trabajador03 = new Developer(1L, "Wendy", "Meneses", 23, "Frontend Dev", 31056d, ProgrammingLanguage.JAVASCRIPT);
		/*
		List -> ArrayList | LinkedList
		
		---- ArrayList
		List<> nombre = new ArrayList<>(); //ArrayList implementa List
		List<> nombre = new LinkedList<>(); //LinkedList implementa List
		*/
		
		System.out.println(trabajador01.calcularSalario());//OP: 22363.0
		System.out.println(trabajador02.calcularSalario());//OP: 79256.22
		System.out.println(trabajador03.calcularSalario());//OP: 31056.0
		
		//Nota, las interfaces no se instancias, solamente se implementan
	}//main

}//TrabajadorMain
