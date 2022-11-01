package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.*;

import co.edu.unbosque.modelo.Algoritmos;
import co.edu.unbosque.modelo.Elemento;
import co.edu.unbosque.view.Interfaz;
import co.edu.unbosque.view.Vista;

import javax.swing.*;

public class Mochila implements ActionListener{

	private Interfaz gui;
	ArrayList<Elemento> almacen = new ArrayList();
	ArrayList<Elemento> mochila = new ArrayList();
	ArrayList<Elemento> tmpMochila = new ArrayList();
	Elemento array[];
	Elemento arrayordenado[];
	String data="";

	double pesoMaximo;
	Vista vista;


	public Mochila(int pm) {
		vista = new Vista();
		pesoMaximo = pm;
		gui=new Interfaz(this);
		gui.setVisible(true);
		cargarDatos();
		transformararray();


	}
	ActionListener oyenteBoton=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			gui.getMostrar1().setText("hola");
			System.out.println("paso");
		}
	};

	public void actionPerformed(ActionEvent event){
		if (event.getActionCommand().equals(gui.getComando_insertar())) {
			System.out.println("insertar");
			try {
				double peso = Double.parseDouble(gui.getPeso().getText());
				int cantidad = Integer.parseInt(gui.getBuscar2().getText());
				double valor = Double.parseDouble(gui.getTextfvalor().getText());
				String nombre = gui.getBuscar1().getText();
				double capacidad = Double.parseDouble(gui.getcapacidad2().getText());
				String res=JOptionPane.showInputDialog("El elemento sera dividido? Si o NO");
				if(res.toLowerCase().equals("si")) {
					int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese en cuanto se va a divdir"));
					int pedasos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos pedasos quiere de estos"));
					double peso2=(peso/cant)*pedasos;
					double valor2=(valor/cant)*pedasos;
					ordenarAñadido(new Elemento(nombre, valor2, peso2, cantidad), capacidad);
				}else {
					ordenarAñadido(new Elemento(nombre, valor, peso, cantidad), capacidad);
				}
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null,"Revise los formatos de ingreso de datos e ingrese el peso");
			}
		}
		if (event.getActionCommand().equals(gui.getComando_mostrar())) {
			mostrarMochila();
			gui.getMostrar1().setText("");
			System.out.println("mostrar");
			data="";
			for(Elemento e:almacen){
				data+= e.getNombre()+" valor "+e.getValor()+" valor "+e.getValor()+"\n";
			}
			gui.getMostrar1().setText(data);
		}

		if(event.getActionCommand().equals(gui.getmejores())){
			data="";
			for(Elemento k:mochila){
				System.out.println("Este es en mochila "+k.getNombre());
				data+="Elemento "+k.getNombre()+" value: "+k.getValor()+" peso: "+k.getPeso()+"\n";
			}

			gui.getMostrar1().setText(data);
		}
	}


	public void cargarDatos() {
		almacen.add(new Elemento("TV", 300, 15,3));
		almacen.add(new Elemento("PS3", 100, 3,3));
		almacen.add(new Elemento("Libro Java", 10, 1,3));
		almacen.add(new Elemento("DVD Player", 5, 0.5,3));
		almacen.add(new Elemento("Blu-Ray", 50, 0.5,3));
		almacen.add(new Elemento("Balon", 30, 0.5,3));
		almacen.add(new Elemento("iPod", 150, 1,3));
		almacen.add(new Elemento("Printer", 20, 4,3));
		almacen.add(new Elemento("VideoBeam", 200, 4,3));
		almacen.add(new Elemento("LapTop", 20, 3,3));
		almacen.add(new Elemento("iPad", 150, 2,3));
		almacen.add(new Elemento("PC", 100, 5,3));
		almacen.add(new Elemento("BlackBerry", 150, 0.5,3));
	}
	public void transformararray(){
		array = new Elemento[almacen.size()];
		arrayordenado = new Elemento[almacen.size()];
		System.out.println("Size "+array.length);
		for(int i=0;i< almacen.size();i++){

			array[i]=almacen.get(i);
		}
		arrayordenado= Algoritmos.quicksort(array,0,array.length-1);
		System.out.println("tamaño "+arrayordenado.length);
		pesoMaximo=32.00;

		mochila=Algoritmos.devuelve(arrayordenado,pesoMaximo);
	}

	public void ordenarAñadido(Elemento elemento,double peso){

		almacen.add(elemento);
		Elemento[] arraux=new Elemento[almacen.size()];
		for(int k=0;k<almacen.size();k++){
			arraux[k]=almacen.get(k);
		}
		arrayordenado=Algoritmos.quicksort(arraux,0,arraux.length-1);
		pesoMaximo=32.00;
		mochila=Algoritmos.devuelve(arrayordenado,peso);
	}


	public void mostrarMochila() {
        double pesoMochila=0;
        double valorMochila=0;
        System.out.println();
        for (Elemento e : mochila) {
            vista.imprimirMensaje(""+e);
            pesoMochila+=e.getPeso();
            valorMochila+=e.getValor();

        }
        vista.imprimirMensaje("------");
        vista.imprimirMensaje("Peso  = %,12.2f %n", pesoMochila);
        vista.imprimirMensaje("Valor = %,12.2f %n", valorMochila);
    }



	double getPeso(List<Elemento> tmp) {
		double respuesta = 0;
		for (Elemento e : tmp)
			respuesta += e.getPeso();
		return respuesta;
	}

	double getValor(List<Elemento> tmp) {
		double respuesta = 0;
		for (Elemento e : tmp)
			respuesta += e.getValor();
		return respuesta;
	}

}