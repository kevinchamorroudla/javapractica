/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Alejandro
 */
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    public Lista(){
        inicio=fin=null;
    }
    public boolean esVacia(){
        return inicio==null && fin==null;
    }
    //metodo para insertar palabras al final de la lista
    public void insertarFin(String dato){
        Nodo nuevo=new Nodo(dato, fin, null);
        if(esVacia()){
            inicio=fin=nuevo;
        }
        else{
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
    //metodo para imprimir las palabras de la lista
    public void imprimir(){
        if(esVacia())
            System.out.println("No hay elementos");
        else{
            Nodo aux=inicio;
            while(aux!=null){
                System.out.printf("%s ",aux.getDato());
                aux=aux.getSiguiente();
            }
            System.out.printf("\n");
        }
    }
    //metodo para eliminar nodos de la lista
    public void eliminar(String dato){
        Nodo aux=inicio;
        boolean encontrado=false;
        while((aux!=null)&&(!encontrado)){
            encontrado=(aux.getDato().equals(dato));
            if(!encontrado)
                aux=aux.getSiguiente();
        }
        if(aux!=null)
        {
            if(aux==inicio)
            {
                inicio=aux.getSiguiente();
                if(aux.getSiguiente()!=null)
                {
                    aux.getSiguiente().setAnterior(null);
                }                   
            }
            else if(aux.getSiguiente()!=null)
            {
                aux.getAnterior().setSiguiente(aux.getSiguiente());
                aux.getSiguiente().setAnterior(aux.getAnterior());
            }
            else
            {
                aux.getAnterior().setSiguiente(null);
                fin=aux.getAnterior();
            }              
        }   
    }
    //metodo para conseguir una palabra de un nodo determinado
    public String getString(int index){
        Nodo aux=inicio;
        if(esVacia())
            System.out.println("No hay elementos");
        else
        {
            int c=0;
            while((aux!=null)&&(c<index))
            {
                aux=aux.getSiguiente();
                c++;
            }
        }
        return aux.getDato();
    }
    //metodo para contar cuantos nodos tiene la lista
    public int contar(){
        int c=0;
        if(esVacia())
            System.out.println("No hay elementos");
        else
        {
            Nodo aux=inicio;
            while(aux!=null)
            {
                aux=aux.getSiguiente();
                c++;
            }
        }
        return c;
    }
}
