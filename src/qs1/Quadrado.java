package qs1;

public class Quadrado implements AreaCalculavel{
	
	public double lado;
	public String area;
	
	public Quadrado(double lado){
		this.lado = lado;
	}

	@Override
	public String calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("Area do quadrado: ");
		area = String.format("%.2f", Math.pow(lado, 2));
		return area;
	}

}
