/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Alejandro
 */
public class Archivo {
    Lista l=new Lista();
    //metodo para crear el archivo y escribir datos
    public void crearArchivo() throws FileNotFoundException, UnsupportedEncodingException{
        File archivo=new File("Archivo.txt");
        if(!archivo.exists())
        {
            try{
                archivo.createNewFile();
            }catch(IOException ex){
                ex.printStackTrace();
            }
            PrintWriter escribir= new PrintWriter(archivo, "utf-8");
            escribir.println("Uno dos tres cuatro");
            escribir.close();
        }
    }
    //metodo para imprimir las palabras del archivo
    public void imprimirArchivo(String palabras) throws FileNotFoundException, IOException{
        String cadena;
        int c=0;
        FileReader f=new FileReader(palabras);
        BufferedReader b=new BufferedReader(f);
        while((cadena=b.readLine())!=null)
        {
            c=0;
            //se utiliza el split para separar las palabras
            //y no imprimir la cadena entera
            String[] parts = cadena.split(" ");
            while(c<parts.length)
            {
                System.out.printf("%s ",parts[c]);    
                c++;
            }
            System.out.printf("\n");
        }          
        b.close(); 
    }
    //metodo para insertar en la lista las palabras del archivo
    public void archivoALista(String palabras) throws FileNotFoundException, IOException{
        String cadena;
        int c=0;
        FileReader f=new FileReader(palabras);
        BufferedReader b=new BufferedReader(f);
        
        while((cadena=b.readLine())!=null)
        {
            String[] parts = cadena.split(" ");
            while(c<parts.length)
            {
                l.insertarFin(parts[c]); 
                c++;
            } 
        }          
        b.close(); 
    }
    //metodo para ingresar datos al archivo
    public void escribir() throws FileNotFoundException, UnsupportedEncodingException{
        {
            try{
                PrintWriter escribir= new PrintWriter("Archivo.txt");
                escribir.println("Palabras de la lista");
                for(int i=0;i<l.contar();i++)
                {
                    escribir.printf("%s ",l.getString(i));
                }    
                escribir.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
            
        }
    }
    //metodo para determinar el funcionamiento del programa
    public void ejecuctar() throws FileNotFoundException, UnsupportedEncodingException{
        //Se imprime los datos de la lista
        System.out.println("Texto original");
        l.imprimir();
        //Se eliminan dos nodos y se vuelve a imprimir para comprobar
        l.eliminar("dos");
        l.eliminar("cuatro"); 
        System.out.println("Texto 2");
        l.imprimir();   
        //Se insertan dos palabras mas y se imprime para comprobar
        l.insertarFin("cinco");
        l.insertarFin("seis");   
        System.out.println("texto 3");
        l.imprimir();
    }
}
