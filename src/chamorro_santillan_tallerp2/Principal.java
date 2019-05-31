package chamorro_santillan_tallerp2;

public class Principal {

    public static void main(String[] args) {
        Lista lista = new Lista();
        DatoPolinomio dato3 = new DatoPolinomio();
        dato3.setSigno(1);
        dato3.setTermino(-3);
        dato3.setExponente(4);
        DatoPolinomio dato2 = new DatoPolinomio();
        dato2.setSigno(-1);
        dato2.setTermino(-4);
        dato2.setExponente(1);
        DatoPolinomio dato1 = new DatoPolinomio();
        dato1.setSigno(1);
        dato1.setTermino(-10);
        dato1.setExponente(0);
        //
        lista.insertarFin(dato3);
        lista.insertarFin(dato2);
        lista.insertarFin(dato1);
        
        //System.out.println("");
        //int numero = Lectura.leerInt("Ingrese el numero para evaluar el polinomio: ");
        //System.out.println(lista.evaluarPolinomio(numero));
        System.out.println("ORIGINAL: ");
        lista.imprimir();
        
        while(true){
            int signo = Lectura.leerInt("Ingrese el numero el signo (1 si es positivo, -1 si es negativo): ");
            int termino = Lectura.leerInt("Ingrese el numero el termino: ");
            int exponente = Lectura.leerInt("Ingrese el numero el exponente: ");

            DatoPolinomio dato4 = new DatoPolinomio(signo,termino,exponente);

            lista.sumaRestaPolinomio(dato4);
            System.out.println("RESULTADO: ");
            lista.imprimir();
            System.out.println("");
        }
    }
    
}
