package ListaDoblementeEnlazada;

public class Nodo {
    
    private Character dato;
    private Nodo anterior;
    private Nodo siguiente;

    public Nodo(Character dato, Nodo anterior, Nodo siguiente) {
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Character getDato() {
        return dato;
    }

    public void setDato(Character dato) {
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
