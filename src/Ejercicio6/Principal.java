package Ejercicio6;

public class Principal {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        DatoPolinomio dato3 = new DatoPolinomio();
        dato3.setTermino(2);
        dato3.setExponente(4);
        DatoPolinomio dato2 = new DatoPolinomio();
        dato2.setTermino(1);
        dato2.setExponente(3);
        DatoPolinomio dato1 = new DatoPolinomio();
        dato1.setTermino(5);
        dato1.setExponente(1);
        lista.insertarFin(dato3);
        lista.insertarFin(dato2);
        lista.insertarFin(dato1);
        lista.imprimir();
        System.out.println("");
        int numero = Lectura.leerInt("Ingrese el numero para evaluar el polinomio: ");
        System.out.println(lista.evaluarPolinomio(numero));
    }
    
}
