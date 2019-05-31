package chamorro_santillan_tallerp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lectura {
    	
    public static String leerString(String mensaje){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(mensaje);
        String cadena = new String();
        try{
            cadena=br.readLine();	
        }catch (IOException e){
                System.out.println("Error, no se pudo leer : " + e.getMessage());
        }
        return cadena;
    }
    
    public static int leerInt(String mensaje){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(mensaje);
        int cadena = 0;
        try{
            cadena=Integer.parseInt(br.readLine());	
        }catch (IOException e){
                System.out.println("Error, no se pudo leer : " + e.getMessage());
        }
        return cadena;
    }
}
