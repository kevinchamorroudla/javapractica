/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

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
    //metodo para insertar al inicio de la lista
    public void insertarInicio(int dato){
        Nodo nuevo=new Nodo(dato, null,inicio);
        if(esVacia()){
            inicio=fin=nuevo;
        }
        else{
            inicio.setAnterior(nuevo);
            inicio=nuevo;
        }
    }
    //metodo para insertar el final de la lista
    public void insertarFin(int dato){
        Nodo nuevo=new Nodo(dato, fin, null);
        if(esVacia()){
            inicio=fin=nuevo;
        }
        else{
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
    //metodo para imprimir los elementos de la lista
    public void imprimir(){
        if(esVacia())
            System.out.println("No hay elementos");
        else{
            Nodo aux=inicio;
            while(aux!=null){
                System.out.println(aux.getDato());
                aux=aux.getSiguiente();
            }
        }
    }
    //metodo para ordenar de mayor a menor
    public void ordenamiento(){
        Nodo aux1=null;
        Nodo aux2=inicio.getSiguiente();
        int aux=Integer.MAX_VALUE;
        while(aux2!=null){
            aux=aux2.getDato();
            aux1=aux2.getAnterior();
            
            while(aux1!=null && aux>aux1.getDato()){
                aux1.getSiguiente().setDato(aux1.getDato());
                aux1=aux1.getAnterior();
            }
        if(aux1==null)
            inicio.setDato(aux);
        else
            aux1.getSiguiente().setDato(aux);
        aux2=aux2.getSiguiente();
        }
        
    }
    //metodo para contar los numeros que se repiten en la lista
    public void contarRepetidos(){
        int num=0, cr=0;
        if(esVacia())
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            //Se usan dos auxiliares debido al bucle doble
            //aux1 se usa para comparar un dato fijo con el resto
            Nodo aux1=inicio;
            while(aux1!=null)
            {
                //aux2 recorre la lista y compara con el dato del aux1
                //para contar las repeticiones
                Nodo aux2=inicio;
                int auxr=0;
                while(aux2!=null)
                {                   
                    if(aux1.getDato()==aux2.getDato())
                        auxr++;
                    aux2=aux2.getSiguiente();
                }
                //cr se utiliza para la mayor cantidad de repeticiones
                //si un numero lo supera entonces se guardan esos datos
                if(auxr>cr)
                {
                    cr=auxr;
                    num=aux1.getDato();
                }
                aux1=aux1.getSiguiente();
            }
            System.out.println("El numero "+num+" se repite "+cr+" veces");
        }
    }
    //metodo para calcular el promedio de la lista
    public void calcularPromedio(){
        float prom=0;
        int tam=0;
        if(esVacia())
            System.out.println("La lista esta vacia");
        else
        {
            Nodo aux=inicio;
            while(aux!=null)
            {
                prom=prom+aux.getDato();
                aux=aux.getSiguiente();
                tam++;
            }
            prom=prom/tam;
            System.out.printf("El promedio de los valores de la lista es %.2f\n",prom);
        }
    }
}
