package entidade;

public class Conta {
	
	private String nome;
	private int numero;
	private double saldo;

	public Conta(String nome, int numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;

	}
	public void sacar(double saque) {
		saldo -= saque;
	}
	
	public void depositar (double depositar) {
		saldo += depositar;
	}
	
	public String mostrar() {
		return "O nome é" + nome +"o saldo é" + saldo;
	}

}
