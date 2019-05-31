/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Random;

/**
 *
 * @author Alejandro
 */
public class Main {
    public static void main(String[] args) {
        Lista datos = new Lista();
        Random r=new Random();
        for(int i=0; i<5; i++){
            datos.insertarInicio(r.nextInt(5)+1);
            datos.insertarFin(r.nextInt(5)+1);
        }
        System.out.println("Datos originales");
        datos.imprimir();
        datos.ordenamiento();
        System.out.println("Datos ordenados");
        datos.imprimir();
        datos.contarRepetidos();
        datos.calcularPromedio();
    }
}
