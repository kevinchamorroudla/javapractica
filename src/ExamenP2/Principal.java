package ExamenP2;

import java.util.Scanner;

public class Principal {
    
    public static int leerEntero(String texto){
        Scanner ingreso =new Scanner(System.in);
        System.out.print(texto);
        int dato=ingreso.nextInt();
        return dato;
    }

    public static String leerString(String texto){
        Scanner ingreso =new Scanner(System.in);
        System.out.print(texto);
        String dato=ingreso.nextLine();
        return dato;
    }

    public static int menu(){
        System.out.println("---Menu---");
        System.out.println("1. Agregar Inicio");
        System.out.println("2. Agregar Final");
        System.out.println("3. Imprimir Lista");
        System.out.println("4. Identificar Forma");
        System.out.println("5. Calcular el Area (Triangulo o Cuadrado)");
        System.out.println("7. Salir");
        int dato=leerEntero("Seleccione una opcion: ");
        return dato;
    }

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        int opcion;

        do{
            opcion=menu();
            switch (opcion) {
              case 1:
                Punto newPuntoI = new Punto();
                newPuntoI.setEjeX(leerEntero("Ingrese el punto X: "));
                newPuntoI.setEjeY(leerEntero("Ingrese el punto Y: "));
                lista.insertarInicio(newPuntoI);
                break;
              case 2:
                Punto newPuntoF = new Punto();
                newPuntoF.setEjeX(leerEntero("Ingrese el punto X: "));
                newPuntoF.setEjeY(leerEntero("Ingrese el punto Y: "));
                lista.insertarFin(newPuntoF);
                break;
              case 3:
                lista.imprimir();
                break;
              case 4:
                  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                  System.out.println(lista.esCuadrado()? "ES CUADRADO":"NO ES CUADRADO");
                  System.out.println(lista.esTriangulo()? "ES TRIANGULO":"NO ES TRIANGULO");
                  System.out.println(lista.esLinea()? "ES LINEA":"NO ES LINEA");
                  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
              case 5:
                  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                  System.out.println(lista.calculoArea());
                  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
              case 6:
                break;
              default:
                System.out.println("Fin del programa!");;
              }

        }while(opcion!=7);
    }
    
}
