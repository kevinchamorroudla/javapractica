package Ejercicio4;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        Lista datos = new Lista();
        Random aleatorio = new Random();
        for (int i = 0; i < 20; i++) {
            datos.insertarFin(1+aleatorio.nextInt(101));
        }
        datos.ordenar();
        System.out.println("LISTA DE NUMEROS ALMACENADOS: ");
        datos.imprimir();
        int maximo = Lectura.leerInt("DIGINE EL NUMERO MAXIMO HASTA DONDE DESEE CORTAR: ");
        datos.EliminarNumerosSuperiores(maximo);
        System.out.println("RESULTADO: ");
        datos.imprimir();
    }
    
}
