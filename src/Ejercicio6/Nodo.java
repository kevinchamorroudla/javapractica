package Ejercicio6;

public class Nodo {
    
    private DatoPolinomio dato;
    private Nodo anterior;
    private Nodo siguiente;

    public Nodo(DatoPolinomio dato, Nodo anterior, Nodo siguiente) {
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public DatoPolinomio getDato() {
        return dato;
    }

    public void setDato(DatoPolinomio dato) {
        this.dato = dato;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
