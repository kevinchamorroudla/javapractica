package ListaDoblementeEnlazada;

public class Principal {

    public static void main(String[] args) {
        
        Lista datos = new Lista();
        
        String cadena = Lectura.leerString("INGRESE UNA CADENA DE CARACTERES: ");
        
        for (int x=0;x<cadena.length();x++){
            datos.insertarFin(cadena.charAt(x));
        }
        System.out.println("LISTA DE DATOS SIN ORDENAR");
        datos.imprimir();
        System.out.println("ORDENANDO...");
        datos.ordenar();
        System.out.println("LISTA DE DATOS ORDENADOS");
        datos.imprimir();
        System.out.println("CARACTER MAXIMO REPERIDA(sensible a mayuscula y minuscula)");
        System.out.println(datos.ObtenerValorMasRepetido());
        
    }
    
}
