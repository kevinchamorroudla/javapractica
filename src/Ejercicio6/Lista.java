package Ejercicio6;

public class Lista {
    
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        inicio = fin = null;
    }

    public boolean esVacia() {
        return inicio == null && fin == null;
    }

    public void insertarInicio(DatoPolinomio dato) {
        Nodo nuevo = new Nodo(dato, null, inicio);
        if (esVacia()) {
            inicio = fin = nuevo;
        } else {
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public void insertarFin(DatoPolinomio dato) {
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
                System.out.print(aux.getDato().getTermino()+"x^"+aux.getDato().getExponente());
                aux = aux.getSiguiente();
                if(aux!=null){
                    System.out.print("+");
                }
            }
            System.out.println("");
        }
    }
    
    public int evaluarPolinomio(int numero) {
        int valor = 0;
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            Nodo aux = inicio;
            while (aux != null) {
                int valor1 = 0;
                valor1 = aux.getDato().getTermino()*numero;
                valor1 = (int) Math.pow(valor1, aux.getDato().getExponente());
                valor += valor1;
                aux=aux.getSiguiente();
            }
        }
        return valor;
    }

}
