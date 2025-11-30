/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 02: Leer linea de texto a través del teclado
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;

public class ReadString{

    public static void main(String[] args){
        
        //definir el flujo de caracteres
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader flujoE=new BufferedReader(isr);

        //defirnir referencia al flujo standard de salida flujoS
        PrintStream flujoS=System.out;

        //variable para almacenar una linea de texto
        String sData;

        try{
           flujoS.print("Introduzca in texto: ");
           sData=flujoE.readLine();
           flujoS.println(sData); 
        }catch(IOException e){

        }





    }

}