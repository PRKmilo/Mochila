package co.edu.unbosque.controller;

import co.edu.unbosque.view.Interfaz;

public class AplMain {
	public static void main(String[] args) {
        // Crear una mochila que soporta hasta 20 Kg. de peso
        Mochila mochila = new Mochila(20);
        mochila.mostrarMochila();

    }
}
