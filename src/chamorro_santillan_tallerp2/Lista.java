package chamorro_santillan_tallerp2;

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
                if(aux.getDato().getSigno() == 1 && aux.getDato().getTermino() > 0){
                    System.out.print("+");
                }else if(aux.getDato().getTermino() > 0){
                    System.out.print("-");
                }
                if(aux.getDato().getExponente() > 0){
                    System.out.print(aux.getDato().getTermino()+"x^"+aux.getDato().getExponente());
                }else{
                    System.out.print(aux.getDato().getTermino()+aux.getDato().getExponente());
                }
                
                aux = aux.getSiguiente();
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
    
    public int sumaRestaPolinomio(DatoPolinomio termino) {
        int valor = 0;
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            Nodo aux = inicio;
            if(aux.getDato().getExponente()<termino.getExponente()){
                Nodo nuevo = new Nodo(termino, null, inicio);
                if (esVacia()) {
                    inicio = fin = nuevo;
                } else {
                    inicio.setAnterior(nuevo);
                    inicio = nuevo;
                }
            }else{
                while (aux != null) {
                
                    if(aux.getDato().getExponente() == termino.getExponente()){
                        aux.getDato().setTermino((aux.getDato().getTermino()*aux.getDato().getSigno())+ (termino.getTermino()*termino.getSigno()));
                    }
                    aux = aux.getSiguiente();
                }
            }
            
            System.out.println("");
        }
        return valor;
    }

}
