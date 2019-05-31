package ExamenP2;

public class Nodo {
    private Punto dato;
    private Nodo anterior;
    private Nodo siguiente;

    public Nodo(Punto dato, Nodo anterior, Nodo siguiente) {
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Punto getDato() {
        return dato;
    }

    public void setDato(Punto dato) {
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
