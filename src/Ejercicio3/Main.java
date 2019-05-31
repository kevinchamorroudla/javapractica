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
public class Main {
    public static void main(String[] args) {
        Lista puntos=new Lista();
        puntos.insertarPunto(1,1);
        puntos.insertarPunto(2,2);
        puntos.insertarPunto(3,5);
        puntos.insertarPunto(1,0);
        puntos.imprimir();
        puntos.ordenamiento();
        puntos.imprimir();
        puntos.puntoMasAlejado();
    }
    
}
