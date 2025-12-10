/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 04: Leer fecha entera mes y año y mostrar los dias del mes. 
*/
import java.io.IOException;


public class AsciiWhile{
    public static void main(String[] args){
        char car=0; //car caracter nulo (\0)

        try{
            System.out.print("introduzca una cadena de texto: ");

            while(true){//Condicion siempre cierta
                car = (char) System.in.read();//leer el sigueinte caracter

                if(car!='\r' && car!='\n'){
                    System.out.println("El codigo ASCII de "+car+" es "+((int) car));
                }

                //Si no hay datos disponibles, solicitarlos 
                if(System.in.available()==0){
                    System.out.println("introduzca una cadena de texto: ");
                }

            }//end while
        }catch(IOException io){
            //No hay codigo en el catch
        }
    }
}