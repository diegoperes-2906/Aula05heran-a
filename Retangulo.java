package entidade;

public class Retangulo extends Forma{

	public Retangulo(double base, double largura, double altura) {
		super(base, largura, altura);
		// TODO Auto-generated constructor stub
	}

	public double calcularArea() {
		return largura * altura;

	}

}
