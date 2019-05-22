package ListaDoblementeEnlazada;

public class pryListaDoblementeEnlazada {

    public static void main(String[] args) {
        
        Lista datos = new Lista();
        
        String cadena = Lectura.leerString("Ingrese una cadena: ");
        
        for (int x=0;x<cadena.length();x++){
            datos.insertarFin(cadena.charAt(x));
        }
        
        datos.ordenar();
        datos.imprimir();
        
    }
    
}
