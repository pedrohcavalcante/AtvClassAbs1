package qs1;

public class Circulo implements AreaCalculavel{
	
	public double raio;
	public String area;
	
	public Circulo(double raio){
		this.raio = raio;
	}

	@Override
	public String calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("Area do circulo: ");
		area = String.format("%.2f", Math.PI * Math.pow(raio, 2.0));
		return area;
	}

}
