package entidade;

public class Triangulo  extends Forma{


	public Triangulo(double base, double largura, double altura) {
		super(base, largura, altura);
		
		}
	public double calcularArea() {
		return base * altura;
	
	   
	}

}
