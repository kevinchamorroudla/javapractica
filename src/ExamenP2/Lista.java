package ExamenP2;

public class Lista {
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        inicio = fin = null;
    }

    public boolean esVacia() {
        return inicio == null && fin == null;
    }

    public void insertarInicio(Punto dato) {
        if(!validarExistencia(dato)){
            Nodo nuevo = new Nodo(dato, null, inicio);
            if (esVacia()) {
                inicio = fin = nuevo;
            } else {
                inicio.setAnterior(nuevo);
                inicio = nuevo;
            }
        }else{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~ EL PUNTO YA EXISTE ~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    public void insertarFin(Punto dato) {
        if(!validarExistencia(dato)){
            Nodo nuevo = new Nodo(dato, fin, null);
            if (esVacia()) {
                inicio = fin = nuevo;
            } else {
                fin.setSiguiente(nuevo);
                fin = nuevo;
            }
        }else{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~ EL PUNTO YA EXISTE ~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    
    public boolean validarExistencia(Punto newDato) {
        if (!esVacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                if(aux.getDato().getEjeX()==newDato.getEjeX() && aux.getDato().getEjeY()==newDato.getEjeY()){
                    return true;
                }
                aux = aux.getSiguiente();
            }
        }
        return false;
    }

    public void imprimir() {
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            Nodo aux = inicio;
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            for (int i=1;aux != null;i++) {
                System.out.println(i + ".~ (X: " + aux.getDato().getEjeX() + ", Y: " + aux.getDato().getEjeY() + ")");
                aux = aux.getSiguiente();
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    
    public boolean esLinea(){
        
        boolean esLineaEnX = true;
        boolean esLineaEnY = true;
        int lenght = ContarPuntos();
        
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            Nodo aux = inicio;
            for (int i=1;aux != null;i++) {
                
                if(aux.getSiguiente() != null){
                    // Linea en el eje X
                    esLineaEnX = esLineaEnX && aux.getDato().getEjeX() == aux.getSiguiente().getDato().getEjeX();
                    // Linea en el eje Y
                    esLineaEnY = esLineaEnY && aux.getDato().getEjeY() == aux.getSiguiente().getDato().getEjeY();
                }
                
                aux = aux.getSiguiente();
            }
        }
        
        return esLineaEnX | esLineaEnY;
    }
    
    public boolean esTriangulo(){
        
        boolean Paso1 = false;
        boolean Paso2 = false;
        boolean Paso3 = false;
        
        int lenght = ContarPuntos();
        
        if (esVacia()) {
            return false;
        } else {
            Nodo aux = inicio;
            for (int i=1 ; aux!=null ; i++) {
                if(lenght == 3){
                    if(aux.getSiguiente() != null){
                        // PASO 1
                        if(i==1){
                            Paso1 = aux.getDato().getEjeX() == aux.getSiguiente().getDato().getEjeX();
                            Paso2 = aux.getDato().getEjeY() == aux.getSiguiente().getDato().getEjeY();
                        }
                        // PASO 1
                        if(i==2){
                            if(Paso1){
                                Paso3 = aux.getAnterior().getDato().getEjeY() == aux.getSiguiente().getDato().getEjeY();
                            }
                            if(Paso2){
                                Paso3 = aux.getAnterior().getDato().getEjeX() == aux.getSiguiente().getDato().getEjeX();
                            }
                        }
                    }
                }else{
                    return false;
                }
                aux = aux.getSiguiente();
            }
            return Paso3;
        }
    }
    
    public boolean esCuadrado(){
        
        boolean Paso1 = false;
        boolean Paso2 = false;
        boolean Paso3 = false;
        boolean Paso4 = false;
        boolean Paso5 = false;
        
        int lenght = ContarPuntos();
        
        if (esVacia()) {
            return false;
        } else {
            Nodo aux = inicio;
            for (int i=1 ; aux!=null ; i++) {
                if(lenght == 4 && aux.getSiguiente() != null){
                    // PASO 1
                    if(i == 1){
                        Paso1 = aux.getDato().getEjeX() == aux.getSiguiente().getDato().getEjeX();
                        Paso2 = aux.getDato().getEjeY() == aux.getSiguiente().getDato().getEjeY();
                    }
                    // PASO 2
                    if(i == 2){
                        if(Paso1){
                            Paso3 = aux.getDato().getEjeY() == aux.getSiguiente().getDato().getEjeX() 
                                    && aux.getDato().getEjeY() == aux.getSiguiente().getDato().getEjeY();
                        }
                        if(Paso2){
                            Paso4 = aux.getDato().getEjeX() == aux.getSiguiente().getDato().getEjeX() 
                                    && aux.getDato().getEjeX() == aux.getSiguiente().getDato().getEjeY();
                        }
                    }
                    // PASO 3
                    if(i == 3){
                        if(Paso3){
                            Paso5 = aux.getDato().getEjeY() == aux.getSiguiente().getDato().getEjeX();
                        }
                        if(Paso4){
                            Paso5 = aux.getDato().getEjeX() == aux.getSiguiente().getDato().getEjeY();
                        }
                    }
                    
                }
                aux = aux.getSiguiente();
            }
            return Paso5;
        }
        
    }
    
    public String calculoArea(){
        if((ContarPuntos() == 4) || (ContarPuntos() == 3)){
            int acumuladorPositivo = 0;
            int acumuladornegativo = 0;
            Punto primero = new Punto();
            Nodo aux = inicio;
            for (int i=1;aux != null;i++) {
                if(aux.getAnterior() == null){
                    primero = aux.getDato();
                }
                if(aux.getSiguiente()!= null){
                    acumuladorPositivo += aux.getDato().getEjeY()*aux.getSiguiente().getDato().getEjeX();
                    acumuladornegativo += aux.getDato().getEjeX()*aux.getSiguiente().getDato().getEjeY();
                }
                
                if(aux.getSiguiente() == null){
                    acumuladorPositivo += aux.getDato().getEjeY()*primero.getEjeX();
                    acumuladornegativo += aux.getDato().getEjeX()*primero.getEjeY();
                }
                
                aux = aux.getSiguiente();
            }
            double valortotal = Math.abs((acumuladorPositivo + (-1 * acumuladornegativo)))/2;
            return " " + valortotal;
        }
        return "No es una figura calculable";
    }
    
    public int ContarPuntos(){
        if (esVacia()) {
            return 0;
        } else {
            Nodo aux = inicio;
            int contar = 0;
            while (aux!=null) {
                contar++;
                aux = aux.getSiguiente();
            }
            return contar;
        }
    }
    
    public void ordenamiento(){
        Nodo aux1=null;
        Nodo aux2=inicio.getSiguiente();
        Punto aux=new Punto();
        while(aux2!=null){
            aux=aux2.getDato();
            aux1=aux2.getAnterior();
            
            while(aux1!=null && aux.getEjeX()>aux1.getDato().getEjeX()){
                aux1.getSiguiente().setDato(aux1.getDato());
                aux1=aux1.getAnterior();
            }
        if(aux1==null)
            inicio.setDato(aux);
        else
            aux1.getSiguiente().setDato(aux);
        aux2=aux2.getSiguiente();
        }
        
    }
    
    public void contarRepetidos(){
        int num=0, cr=0;
        if(esVacia())
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            Nodo aux1=inicio;
            while(aux1!=null)
            {
                Nodo aux2=inicio;
                int auxr=0;
                while(aux2!=null)
                {                   
                    if(aux1.getDato()==aux2.getDato())
                        auxr++;
                    aux2=aux2.getSiguiente();
                }
                if(auxr>cr)
                {
                    cr=auxr;
                    num=aux1.getDato().getEjeX();
                }
                aux1=aux1.getSiguiente();
            }
            System.out.println("El numero "+num+" se repite "+cr+" veces");
        }
    }
    
    public void calcularPromedio(){
        float prom=0;
        int tam=0;
        if(esVacia())
            System.out.println("La lista esta vacia");
        else
        {
            Nodo aux=inicio;
            while(aux!=null)
            {
                prom=prom+aux.getDato().getEjeX();
                aux=aux.getSiguiente();
                tam++;
            }
            prom=prom/tam;
            System.out.printf("El promedio de los valores de la lista es %.2f\n",prom);
        }
    }
}
