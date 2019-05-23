package Ejercicio2;

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
    
    public String ObtenerValorMasRepetido() {
        Character dato = null;
        if (esVacia()) {
            return "No hay elementos";
        } else {
            Nodo aux = inicio;
            int maxRepeticion = 0;
            int contador = 0;
            while (aux != null) {
                //if((aux.getDato() >= 65 && aux.getDato() <= 90) | (aux.getDato() >= 97 && aux.getDato() <= 122)){
                    if(aux.getSiguiente() != null && aux.getDato() == aux.getSiguiente().getDato()){
                        contador++;
                    }else{
                        if(contador > maxRepeticion){
                            dato = aux.getDato();
                            maxRepeticion = contador;
                        }
                        if(contador == maxRepeticion && dato != aux.getDato()){
                            dato = null;
                        }
                        contador = 0;
                    }
                //}
                aux = aux.getSiguiente();
            }
        }
        if(dato == null){
            return "!No existe una letra con un mayor grado de repeticion!";
        }else{
            return "-El caracter mas repetido es : '" + dato + "'"; 
        }
    }
    
}
