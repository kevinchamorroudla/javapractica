package ListaDoblementeEnlazada;

public class Lista {
    
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        inicio = fin = null;
    }

    public boolean esVacia() {
        return inicio == null && fin == null;
    }

    public void insertarInicio(Character dato) {
        Nodo nuevo = new Nodo(dato, null, inicio);
        if (esVacia()) {
            inicio = fin = nuevo;
        } else {
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public void insertarFin(Character dato) {
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
        Nodo auxA;
        Character aux;
        while (auxV != null) {
            aux = auxV.getDato();
            auxA = auxV.getAnterior();
            while (auxA != null && (aux < 97 ? (aux+32) : aux) < (auxA.getDato() < 97 ? (auxA.getDato()+32) : auxA.getDato())) {
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
    
    public void ObtenerValorMasRepetido() {
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            Nodo aux = inicio;
            int maxRepeticion = 0;
            int contador = 0;
            Character dato;
            Character datoSeguiente;
            while (aux != null) {
                dato = aux.getDato();
                if(aux.getSiguiente() != null){
                    datoSeguiente = aux.getSiguiente().getDato();
                }else{
                    break;
                }
                if(dato==datoSeguiente){
                    contador++;
                }
            }
        }
    }
    
}
