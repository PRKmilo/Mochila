package co.edu.unbosque.view;

public class Vista {
	
	public Vista() {}
	
	public void imprimirMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public void imprimirMensaje(String mensaje, double valor) {
		System.out.printf(mensaje, valor);
	}
}
