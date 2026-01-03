/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 14: Programa que lee un texto y da como resultado el numero de caracteres, palabras y lienas del mismo. 
*/
import java.io.*;

public class CountWords{
    public static void main(String[] args){
        final char eof=(char) -1;
        char car;
        boolean word = false;
        int numCaracteres=0, numWords=0, numLines=0;

        try{

            System.out.print("Introducir texto. Pulse enter despues de cada linea\nPara finalizar pulsar Ctrl+z en windows o Ctrl+D en linux: ");

            while( (car=(char) System.in.read()) !=eof){

                if(car=='\r'){
                    numCaracteres++;
                }

                numCaracteres++;

                if(car==' ' || car=='\n' || car=='\t'){
                    word=false;
                }else if(!word){
                    numWords++;
                    word=true;
                }

                if(car=='\n'){
                    numLines++;
                }

            }//end while    

            System.out.println();
            System.out.println("\n\nCaracteres: "+numCaracteres+"\nPalabras: "+numWords+"\nSaltos de linea: "+numLines);            

        }catch(IOException ignorada){

        }


    }
}
