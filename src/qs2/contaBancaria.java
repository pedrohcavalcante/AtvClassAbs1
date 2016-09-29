package qs2;

public abstract class contaBancaria {
	protected double saldo;
	
	public void depositar(double value){
		this.saldo += value;
	}
	
	public void sacar(double value){
		this.saldo -= value;
	}
	
	public void transferir(double value, contaBancaria account){
		sacar(value);
		account.depositar(value);
	}
	
	abstract double calcularSaldo();
}
