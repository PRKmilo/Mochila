package co.edu.unbosque.view;

import co.edu.unbosque.controller.Mochila;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame{
    private static final long serialVersionUID = 1L;

    private JTextField buscar1;
    private JTextField buscar2;
    private JTextField textfvalor;
    private JLabel nombrenuevo;
    private JLabel cantnuevo;
    private JLabel pesonuevo;
    private JLabel Instruccion;
    private JTextField peso;
    private JLabel valornuevo;
    private JTextArea mostrar1;
    private JScrollPane archivo1;
    private JButton bsearchbm;
    private JButton bsearchmbm;
    private JButton bvolver1;
    private JButton bsubir1;
    private JLabel numero1;
    private JLabel ingresarbm;
    private JLabel ingresarcapacidad;
    private JTextField ingresarcapacidad2;

    private static final String FUENTE = "Verdana";
    public static final String SUBIR2 = "Mejores";
    public static final String VOLVER2 = "Mostrar";
    public static final String BUSCAR2 = "Buscar BM";
    public static final String BUSCARMA2 = "Añadir";

    public static final String comando_insertar="insertar";
    public static final String comando_mostrar="mostrar";
    public static final String comando_mejores="mejores";

    /**
     * Se instancian nustros componentes para nuestra
     * ventana de algoritmo booyer moore.
     * @param
     */
    public Interfaz(Mochila c) {


        setBounds(600,100,650,600);

        numero1 = new JLabel();
        numero1.setFont(new Font(FUENTE, Font.BOLD, 15));
        numero1.setForeground(Color.WHITE);
        numero1.setBounds(370, 250, 150, 20);
        Instruccion=new JLabel();
        Instruccion.setFont(new Font(FUENTE, Font.BOLD, 13));
        Instruccion.setBounds(20,10,270,20);
        Instruccion.setText("Ingrese el nuevo objeto a la lista");
        ingresarbm = new JLabel("INGRESE EL PATRON");
        ingresarbm.setFont(new Font(FUENTE, Font.BOLD, 13));
        ingresarbm.setForeground(Color.WHITE);
        ingresarbm.setBounds(20, 20, 170, 20);

        bsearchbm = new JButton(BUSCAR2);
        bsearchbm.setFont(new Font(FUENTE, Font.BOLD, 13));
        bsearchbm.setBounds(370, 95, 140, 20);
        bsearchbm = new JButton(BUSCARMA2);
        bsearchbm.setFont(new Font(FUENTE, Font.BOLD, 13));
        bsearchbm.setBounds(370, 65, 200, 20);
        bsearchbm.setActionCommand(comando_insertar);
        bsearchbm.addActionListener(c);
        ingresarcapacidad=new JLabel();
        ingresarcapacidad.setFont(new Font(FUENTE, Font.BOLD, 13));
        ingresarcapacidad.setText("Ingrese capacidad de maleta");
        ingresarcapacidad.setBounds(350,125, 230, 20);
        ingresarcapacidad2=new JTextField();
        ingresarcapacidad2.setBounds(350,150, 230, 20);

        buscar1 = new JTextField();
        buscar1.setFont(new Font(FUENTE, Font.BOLD, 10));
        buscar1.setBounds(70, 32, 70, 20);

        nombrenuevo=new JLabel();
        nombrenuevo.setFont(new Font(FUENTE, Font.BOLD, 10));
        nombrenuevo.setText("Nombre");
        nombrenuevo.setBounds(20, 32, 70, 20);
        buscar2 = new JTextField();
        buscar2.setFont(new Font(FUENTE, Font.BOLD, 10));
        buscar2.setBounds(222   , 32, 70, 20);
        cantnuevo=new JLabel("Cantidad");
        cantnuevo.setFont(new Font(FUENTE, Font.BOLD, 10));
        cantnuevo.setText("Cantidad");
        cantnuevo.setBounds(155, 32, 70, 20);
        pesonuevo=new JLabel();
        pesonuevo.setFont(new Font(FUENTE, Font.BOLD, 10));
        pesonuevo.setText("Peso unidad");

        pesonuevo.setBounds(295, 32, 70, 20);
        peso=new JTextField();
        peso.setFont(new Font(FUENTE, Font.BOLD, 10));
        peso.setBounds(365, 32, 70, 20);
        textfvalor=new JTextField();
        textfvalor.setBounds(490,32, 70, 20);
        mostrar1 = new JTextArea();
        archivo1 = new JScrollPane(mostrar1);
        archivo1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        archivo1.setBounds(10, 65, 320, 380);
        valornuevo=new JLabel();
        valornuevo.setFont(new Font(FUENTE, Font.BOLD, 10));
        valornuevo.setText("Valor");
        valornuevo.setBounds(450,38,50,30);
        bvolver1 = new JButton(VOLVER2);
        bvolver1.setFont(new Font(FUENTE, Font.BOLD, 12));
        bvolver1.setBounds(370, 425, 100, 20);
        bvolver1.setActionCommand(comando_mostrar);
        bvolver1.addActionListener(c);

        bsubir1 = new JButton(SUBIR2);
        bsubir1.setFont(new Font(FUENTE, Font.BOLD, 12));
        bsubir1.setBounds(480, 425, 130, 20);
        bsubir1.setActionCommand(comando_mejores);
        bsubir1.addActionListener(c);
        add(Instruccion);
        add(nombrenuevo);
        add(buscar1);
        add(cantnuevo);
        add(buscar2);
        add(pesonuevo);
        add(peso);
        add(valornuevo);
        add(textfvalor);
        add(ingresarcapacidad);
        add(ingresarcapacidad2);
        add(bvolver1);
        add(archivo1);
        add(bsearchbm);

        add(bsubir1);
        add(numero1);
        add(ingresarbm);

    }

    public JButton getBsearchbm() {
        return bsearchbm;
    }

    public void setBsearchbm(JButton bsearchbm) {
        this.bsearchbm = bsearchbm;
    }

    public JButton getBsearchmbm() {
        return bsearchmbm;
    }

    public void setBsearchmbm(JButton bsearchmbm) {
        this.bsearchmbm = bsearchmbm;
    }

    public JLabel getIngresarbm() {
        return ingresarbm;
    }

    public void setIngresarbm(JLabel ingresarbm) {
        this.ingresarbm = ingresarbm;
    }

    public JTextField getBuscar1() {
        return buscar1;
    }

    public void setBuscar1(JTextField buscar1) {
        this.buscar1 = buscar1;
    }
    public JTextField getBuscar2(){
        return buscar2;
    }

    public JTextField getPeso(){
        return peso;
    }

    public JTextField getTextfvalor(){
        return textfvalor;
    }
    public JTextArea getMostrar1() {
        return mostrar1;
    }

    public void setMostrar1(JTextArea mostrar1) {
        this.mostrar1 = mostrar1;
    }

    public JScrollPane getArchivo1() {
        return archivo1;
    }

    public void setArchivo1(JScrollPane archivo1) {
        this.archivo1 = archivo1;
    }

    public JButton getBvolver1() {
        return bvolver1;
    }

    public void setBvolver1(JButton bvolver1) {
        this.bvolver1 = bvolver1;
    }

    public JButton getBsubir1() {
        return bsubir1;
    }

    public void setBsubir1(JButton bsubir1) {
        this.bsubir1 = bsubir1;
    }

    public JLabel getNumero1() {
        return numero1;
    }

    public void setNumero1(JLabel numero1) {
        this.numero1 = numero1;
    }
    public String getComando_insertar(){
        return comando_insertar;
    }
    public String getComando_mostrar(){
        return comando_mostrar;
    }

    public JTextField getTextvalor(){
        return this.textfvalor;
    }
    public JButton getCommand_mejores(){
        return this.bvolver1;
    }
    public String getmejores(){
        return comando_mejores;
    }
    public JTextField getcapacidad2(){
        return this.ingresarcapacidad2;
    }

}
