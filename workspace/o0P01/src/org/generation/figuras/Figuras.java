package org.generation.figuras;

public class Figuras {
	//1. Atributos (variables de instancia)
	double base;
	double altura;
	double radio;
	
	//2. Métodos constructores (Overloading)
	public Figuras(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Figuras(double radio) {
		this.radio = radio;
	}
	
	//3. Métodos getters y setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//4. Crear métodos para calcular el área de figuras
	//Rectángulo
	public double areaRectangulo() {
		return base * altura;
	}
	
	//Triángulo
	public double areaTriangulo() {
		return (base * altura) / 2;
	}
		
	//Círculo
	public double areaCirculo() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	//Método static para calcular el área de un círculo. Este método se convierte en
	//propio de la clase, por lo tanto no requiere de instancias específicas para ser
	//invodado.
	public static double calcularAreaCirculoStatic(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}

	//5. toString();
	@Override
	public String toString() {
		if(radio == 0) {
			return "Base= " + base + ", altura= " + altura;
		} else {
			return "Radio= " + radio;
		}		
	}
}
