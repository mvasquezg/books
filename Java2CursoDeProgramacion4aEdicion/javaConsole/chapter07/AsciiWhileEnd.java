/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 05: Leer caracteres y finalizar el bucle. 
*/
import java.io.IOException;

public class AsciiWhileEnd{
    public static void main(String[] args){
        final char eof=(char)-1; 
        char car = 0;               //car caracter nulo (\0)

        try{
            System.out.print("introduzca una cadena de texto: \nPara terminar pulse Ctrl+z\n");

            while( (car = (char)System.in.read())!=eof){//Condicion siempre cierta
                
                if(car!='\r' && car!='\n'){
                    System.out.println("El codigo ASCII de "+car+" es "+((int) car));
                }

            }//end while
        }catch(IOException io){
            //No hay codigo en el catch
        }
    }
}