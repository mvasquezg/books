/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 05: Programa Test
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.IOException;

public class Test{
    
    public static void main(String[] args){
        //Definir un flujo de caracteres de entrada: flujoE
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader flujoE=new BufferedReader(isr);

        //Definir una referencia al flujo standar de salida: flujoS
        PrintStream flujoS=System.out;

        String sData;
        float price=0.0F;

        try{
            flujoS.print("Precio: ");
            sData=flujoE.readLine();

            price=(sData!=null)?Float.parseFloat(sData):Float.NaN;
        }catch(IOException ignore){ }
        
        flujoS.println(price);
        flujoS.println("Continua la aplicación");
    }

}