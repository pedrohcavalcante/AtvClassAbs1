package qs1;

public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCalculavel circ = new Circulo(5.0);
		AreaCalculavel quad = new Quadrado(5.0);
		AreaCalculavel reta = new Retangulo(5, 5);
		AreaCalculavel tria = new Triangulo(5, 5);
		AreaCalculavel circ1 = new Circulo (6.0);
		
		System.out.println(circ.calcularArea());
		System.out.println(quad.calcularArea());
		System.out.println(reta.calcularArea());
		System.out.println(tria.calcularArea());
		System.out.println(circ1.calcularArea());
	}

}
