/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 12: Programa explicar lo que ocurre y realizar las modificaciones necesarias para el correcrto funcionamiento*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.IOException;

public class Test1FinalBook{
    public static void main(String[] args){
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader flujoE=new BufferedReader(isr);

        PrintStream flujoS=System.out;
        
        char car=0;

        try{
            flujoS.print("Caracter: ");
            car=(char) flujoE.read(); //Lee el caracter
            flujoE.readLine();        //Lee el caracter de espacio en blanco  
            flujoS.println(car);

            flujoS.print("Caracter: ");
            car=(char) flujoE.read();

            flujoS.println(car);

        }catch(IOException e){

        }
    }
}