package org.generation.figuras;

public class FigurasMain {

	public static void main(String[] args) {
		//rectanguloRojo, circuloVerde, trianguloAmarillo, circuloMorado
		Figuras rectanguloRojo = new Figuras(22.0d, 47.0d);
		Figuras circuloVerde = new Figuras(15.0d);
		Figuras trianguloAmarillo = new Figuras(15.2d, 28.6d);
		Figuras circuloMorado = new Figuras(20.0d);
		
		System.out.println(rectanguloRojo);
		System.out.println(circuloVerde);
		
		System.out.println(circuloMorado.areaCirculo());
		System.out.println(trianguloAmarillo.areaTriangulo());
		System.out.println(rectanguloRojo.areaRectangulo());
		
		//Mandando a llamar al método static
		double circuloAzul = Figuras.calcularAreaCirculoStatic(20.0d);
		System.out.println(circuloAzul);
		
		//Mandar a llamar la propiedad del atributo de un objeto se debe realizar mediante Getters
		System.out.println("La base del rectángulo rojo es " + rectanguloRojo.getBase());
		

	}

}
