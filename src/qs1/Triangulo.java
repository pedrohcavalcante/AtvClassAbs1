package qs1;

public class Triangulo implements AreaCalculavel{
	public double base, altura;
	public String area;
	
	public Triangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}

	@Override
	public String calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("Area do triangulo: ");
		area = String.format("%.2f", (base*altura)/2);
		return area;
	}

}
