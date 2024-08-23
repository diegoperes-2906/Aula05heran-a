package principal;

import java.util.Scanner;
import entidade.Conta;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class Cadastro {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		for(int i= 0; i<5; i ++) {
			System.out.println("Digite o nome: ");
			String nome = scn.next();
			
			System.out.println("Digite o numero: ");
			int numero = scn.nextInt();
			
			System.out.println("Escolha uma opcao: \n 1- conta poupanca \n 2- conta corrente");
			int opcao = scn.nextInt();
			
			System.out.println("Digite um valor para ser depositado:");
			int saldo = scn.nextInt();
			
			Conta a = new ContaCorrente(nome, numero, 0, saldo);
			Conta b = new ContaPoupanca(nome, numero, saldo);
			
			a.depositar(saldo);
			
			if(opcao == 1) {
				System.out.println("Conta cadastrada!: \nTipo de conta: Poupanca \nNome: " + nome + "" + 
			"\nNumero da conta: " + numero + "\nSaldo depositado " + saldo);
				
			}
			else if(opcao ==2) {
				System.out.println("Conta cadastrada!: \nTipo de conta: Corrente \nNome: " + nome + "" + 
						"\nNumero da conta: " + numero + "\nSaldo depositado " + saldo);
							
		}
		
		
		}


	}

}
