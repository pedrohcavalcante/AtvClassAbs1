package qs2;

public class ATM {
	public static void main(String[] args){
		contaBancaria conta1 = new ContaCorrente();
		contaBancaria conta2 = new ContaInvestimento();
		
		conta1.depositar(1000);
		System.out.println(conta1.calcularSaldo());
		
		conta2.depositar(2500);
		System.out.println(conta2.calcularSaldo());
		
		conta1.transferir(100, conta2);
		System.out.println(conta2.calcularSaldo());
		System.out.println(conta1.calcularSaldo());
		conta2.transferir(250, conta1);
		System.out.println(conta1.calcularSaldo());
		
	}
}
