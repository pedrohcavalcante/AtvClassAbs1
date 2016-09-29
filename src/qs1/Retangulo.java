package qs1;

public class Retangulo implements AreaCalculavel{
	
	public double base, altura;
	public String area;
	
	public Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}

	@Override
	public String calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("Area do retangulo: ");
		area = String.format("%.2f", base*altura);
		return area;
	}

}
