package principal;

import java.util.ArrayList;
import java.util.List;

import entidade.Conta;
import entidade.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente( "Gustavo",300, 0, 300);
		Conta d = new ContaCorrente("Diego", 300, 0, 200);
		
		List<Conta> lista = new ArrayList<>();
		lista.add(c);
		lista.add(d);
		
		System.out.println(lista);
		

	}

}
