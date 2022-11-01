package co.edu.unbosque.modelo;

public class Elemento {
    
	private String nombre;
    private double valor;
    private double peso;
    private double valorpeso;
	private int cantidad;
    
    public Elemento(String n, double v, double p,int c) {
        nombre=n;
        valor =v;
        peso  =p;
		cantidad=c;
        setValorpeso(valor / peso);
    }
    
    public String toString() {
        return String.format("%-15s %,12.2f %,12.2f", nombre, valor, peso);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getPeso() {
		return (int)peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getValorpeso() {
		return valorpeso;
	}

	public void setValorpeso(double valorpeso) {
		this.valorpeso = valorpeso;
	}

	public double getCantidad(){return cantidad;};

	public void setCantidad(int cantidad){ this.cantidad=cantidad;}
    
}
