/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Alejandro
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        Archivo arch=new Archivo();
        arch.crearArchivo();
        arch.archivoALista("Archivo.txt");
        arch.ejecuctar();
        //Se ingresan las palabras de la lista al archivo
        arch.escribir();
        System.out.println("Texto 4");
        //se imprimen los datos del archivo para comprobar
        arch.imprimirArchivo("Archivo.txt");
    }
    
}
