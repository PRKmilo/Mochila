package co.edu.unbosque.modelo;

import java.util.ArrayList;

public class Algoritmos {

    public static Elemento[] quicksort(Elemento A[],int izq,int der){
        Elemento pivote=A[izq];
        int i=izq;
        int j=der;
        Elemento aux;
        while(i < j){
            while(A[i].getValor() <= pivote.getValor() && i < j) i++;
            while(A[j].getValor() > pivote.getValor()) j--;
            if (i < j) {
                aux= A[i];
                A[i]=A[j];
                A[j]=aux;
            }
        }
        A[izq]=A[j];
        A[j]=pivote;

        if(izq < j-1)
            quicksort(A,izq,j-1);
        if(j+1 < der)
            quicksort(A,j+1,der);

        return A;
    }
    public static ArrayList<Elemento> devuelve(Elemento[] array, double pesonew){
        double pes=pesonew;
        ArrayList<Elemento> listaaux=new ArrayList<Elemento>();
        for(int i=0;i<array.length;i++){
            double cant=array[array.length-1-i].getCantidad();
            while(array[array.length-1-i].getPeso() <= pes &&  cant >0){
                listaaux.add(array[array.length-1-i]);
                pes=pes-array[array.length-1-i].getPeso();
                cant--;
            }
        }
        return listaaux;
    }
}
