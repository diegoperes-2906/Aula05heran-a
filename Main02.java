package principal;

import java.util.Scanner;

import entidade.Retangulo;
import entidade.Triangulo;

public class Main02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Qual tipo de forma vc quer fazer: ");
		String tipo = scn.nextLine();
		if(tipo.equalsIgnoreCase("triangulo")) {
			System.out.println("Digite a base: ");
			double base = scn.nextDouble();
			System.out.println("Digite a altura: ");
			double altura = scn.nextDouble();
			Triangulo triangulo = new Triangulo(base, 0, altura);
			System.out.println(triangulo.calcularArea());
			
		}else if(tipo.equalsIgnoreCase("Retangulo")) {
			System.out.println("Digite a largura: ");
			double largura = scn.nextDouble();
			System.out.println("Digite a altura: ");
			double altura = scn.nextDouble();
			Retangulo retangulo = new Retangulo(0, largura, altura);
			System.out.println(retangulo.calcularArea());
			
		}
	
      
       

	}

}
