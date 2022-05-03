
package Boletin33;

import java.util.ArrayList;


public class Operacions <T>{
   
    T dato;

    public Operacions() {
    }

    public Operacions(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Operacions{" + "dato=" + dato + '}';
    }
   
    
    
    
    
    public static <T extends Comparable> void calcularMaior(ArrayList<T> lista){
     T maior = (T) lista.get(0);
     for(int i=1; i<lista.size();i++){
         if(maior.compareTo(lista.get(i))<0)
             maior=lista.get(i);
     }
        System.out.println("o maior e:" + maior);
        }
    public static <T extends Comparable> void calcularMenor(ArrayList<T> lista){
        T menor= (T) lista.get(0);
        for(int i=1; i>lista.size(); i++){
            if(menor.compareTo(lista.get(i))>0)
                menor=lista.get(i);
        }
    }
   
    }
    
   
   
