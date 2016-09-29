package qs2;

public class ContaCorrente extends contaBancaria {

	@Override
	double calcularSaldo() {
		System.out.println("Saldo ContaCorrente: ");
		saldo = saldo - (saldo*(10.0/100.0));
		return saldo;
		// TODO Auto-generated method stub

	}

}
