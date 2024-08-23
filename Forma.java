package entidade;

public class Forma {
	
	public double base;
	public double largura;
	public double altura;
	public String tipo;

	public Forma (double base, double largura, double altura) {
		this.base = base;
		this.largura = largura;
		this.altura = altura;
		this.tipo = tipo;
		
	}
	
	private double calcularArea() {
		return base * altura;

}
	public void mostrarInfo() {
		System.out.println("Tipo de forma: " + tipo);
		System.out.println("Area: " + calcularArea());
	}
	

}

		
