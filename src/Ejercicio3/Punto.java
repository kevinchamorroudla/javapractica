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
//Clase punto con coordenadas en X y Y
public class Punto {
    private int coordenadaX;
    private int coordenadaY;
    private Punto anterior;
    private Punto siguiente;

    public Punto(int coordenadaX, int coordenadaY, Punto anterior, Punto siguiente) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }   

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public Punto getAnterior() {
        return anterior;
    }

    public void setAnterior(Punto anterior) {
        this.anterior = anterior;
    }

    public Punto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Punto siguiente) {
        this.siguiente = siguiente;
    }
    
}
