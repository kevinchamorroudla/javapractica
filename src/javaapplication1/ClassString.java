/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author kevin
 */
public class ClassString {
    
    private String texto;
    
    public ClassString(String texto){
        this.texto = texto;
    }
    
    public String getTexto(){
        return texto;
    }
    
    public void setTexto(String texto){
        this.texto = texto;
    }
    
    public ClassString obtener(String parametro) {

        Object b=null;

        ClassString a=(ClassString)b;

        if (parametro.compareTo("") != 0) {

            a=new ClassString("");

        }

        return a;

 

    }
}
