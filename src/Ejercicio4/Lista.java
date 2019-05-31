package Ejercicio4;

public class Lista {
    
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        inicio = fin = null;
    }

    public boolean esVacia() {
        return inicio == null && fin == null;
    }

    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato, null, inicio);
        if (esVacia()) {
            inicio = fin = nuevo;
        } else {
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public void insertarFin(int dato) {
        Nodo nuevo = new Nodo(dato, fin, null);
        if (esVacia()) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void imprimir() {
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            Nodo aux = inicio;
            while (aux != null) {
                System.out.print(aux.getDato() + " ");
                aux = aux.getSiguiente();
            }
            System.out.println("");
        }
    }

    public void ordenar() {
        Nodo auxV = inicio.getSiguiente();
        Nodo auxA = null;
        int aux = Integer.MIN_VALUE;
        while (auxV != null) {
            aux = auxV.getDato();
            auxA = auxV.getAnterior();
            while (auxA != null && aux < auxA.getDato()) {
                auxA.getSiguiente().setDato(auxA.getDato());
                auxA = auxA.getAnterior();
            }
            if (auxA == null) {
                inicio.setDato(aux);
            } else {
                auxA.getSiguiente().setDato(aux);
            }
            auxV = auxV.getSiguiente();
        }
    }
    
    public void EliminarNumerosSuperiores(int numeroMaximo){
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            Nodo aux = inicio;
            while (aux != null) {
                if(aux.getDato() > numeroMaximo){
                    fin = aux.getAnterior();
                    fin.setSiguiente(null);
                    break;
                }
                aux = aux.getSiguiente();
            }
        }
    }
}
