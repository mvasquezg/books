/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 04: Creando una clase leer
*/
import java.lang.NumberFormatException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadData{

    public static String data(){
        String sData="";

        try{
            //Definir un flujo de caracteres de entrada: flujoE
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader flujoE=new BufferedReader(isr);

            //Leer. La entrada finaliza al pulsar la tecla entrar 
            sData=flujoE.readLine(); 
        }catch(IOException e){
            System.err.println("Error: "+e.getMessage());
        }

        return sData;//Devuelve el dato tecleado.
    }

    public static short getDataShort(){
        try{
            return Short.parseShort(data());
        }catch(NumberFormatException e){
            return Short.MIN_VALUE; //valor mas pequeño
        }
    }

    public static int getDataInt(){
        try{
            return Integer.parseInt(data());
        }catch(NumberFormatException e){
            return Integer.MIN_VALUE; //valor mas pequeño
        }
    }

    public static long getDataLong(){
        try{
            return Long.parseLong(data());
        }catch(NumberFormatException e){
            return Long.MIN_VALUE; //valor mas pequeño
        }
    }

    public static float getDataFloat(){
        try{
            return Float.parseFloat(data());
        }catch(NumberFormatException e){
            return Float.NaN; //No es un numero. Valor Float
        }
    }

    public static double getDataDouble(){
        try{
            return Double.parseDouble(data());
        }catch(NumberFormatException e){
            return Double.NaN; //No es un numero. Valor double
        }
    }

}