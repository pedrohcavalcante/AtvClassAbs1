package qs2;

public class ContaInvestimento extends contaBancaria {

	@Override
	double calcularSaldo() {
		System.out.println("Saldo ContaInvestimento: ");
		saldo = saldo + (saldo*(5.0/100.0));
		return saldo;
		// TODO Auto-generated method stub

	}

}
