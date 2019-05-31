/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Alejandro
 */
public class Lista {
    private Punto inicio;
    private Punto fin;
    public Lista(){
        inicio=fin=null;
    }
    public boolean esVacia(){
        return inicio==null && fin==null;
    }
    //metodo para insertar las coordenadas de los puntos en la lista
    public void insertarPunto(int x, int y){
        Punto nuevo=new Punto(x, y, null,inicio);
        if(esVacia()){
            inicio=fin=nuevo;
        }
        else{
            inicio.setAnterior(nuevo);
            inicio=nuevo;
        }
    }
    //metodo para imprimir las coordenadas de los puntos
    //y su distancia al origen
    public void imprimir(){
        if(esVacia())
            System.out.println("No hay elementos");
        else{
            Punto aux=inicio;
            while(aux!=null){
                System.out.println("X: "+aux.getCoordenadaX()+" Y: "+aux.getCoordenadaY());
                System.out.println("Distancia al origen: "+calcularDistancia(aux.getCoordenadaX(),aux.getCoordenadaY()));
                aux=aux.getSiguiente();
            }
        }
    }
    //Metodo para calcular la distancia desde los puntos hacia el origen
    public double calcularDistancia(int x, int y){
        double dis=0;       
        if(esVacia()){
            System.out.println("No hay elementos");
        }
        else{
            dis=Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));
        }
        return dis;
    }
    //metodo para ordenar los puntos en base a su distancia al origen
    public void ordenamiento(){
        Punto aux1=null;
        Punto aux2=inicio.getSiguiente();
        int auxX, auxY;
        while(aux2!=null){
            auxX=aux2.getCoordenadaX();
            auxY=aux2.getCoordenadaY();
            aux1=aux2.getAnterior();
            
            while(aux1!=null && calcularDistancia(auxX,auxY)<calcularDistancia(aux1.getCoordenadaX(),aux1.getCoordenadaY())){
                aux1.getSiguiente().setCoordenadaX(aux1.getCoordenadaX());
                aux1.getSiguiente().setCoordenadaY(aux1.getCoordenadaY());
                aux1=aux1.getAnterior();
            }
        if(aux1==null)
        {
            inicio.setCoordenadaX(auxX);
            inicio.setCoordenadaY(auxY);
        }
        else
        {
           aux1.getSiguiente().setCoordenadaX(auxX);
           aux1.getSiguiente().setCoordenadaY(auxY); 
        }           
        aux2=aux2.getSiguiente();
        }
        
    }
    //metodo para determinar el punto mas alejado
    public void puntoMasAlejado(){
        if(esVacia())
        {
            System.out.println("No hay elementos");
        }
        else
        {
            Punto aux=inicio;
            int x=0, y=0;
            double dis=0;
            while(aux!=null)
            {
                if(calcularDistancia(aux.getCoordenadaX(),aux.getCoordenadaY())>dis)
                {
                    dis=calcularDistancia(aux.getCoordenadaX(),aux.getCoordenadaY());
                    x=aux.getCoordenadaX();
                    y=aux.getCoordenadaY();
                }
                aux=aux.getSiguiente();
                
            }
            System.out.println("El punto más alejado del origen tienes coordenadas X: "+x+" Y: "+y);
        }
    }
}
