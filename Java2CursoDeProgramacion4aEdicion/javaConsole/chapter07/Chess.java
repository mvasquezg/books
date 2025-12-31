/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 09: Bucle FOR aplicada al ajedres. 
*/
import java.util.Scanner;

public class Chess{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int falfil=0, calfil=0;
        int fila=0, columna=0;

        System.out.println("Posicion del alfil: ");
        System.out.print("Fila: ");
        falfil=in.nextInt();

        System.out.print("Columna: ");
        calfil=in.nextInt();

        System.out.println();

        //pintar el tablero
        for(int i=1; fila<=8; fila++){

            for(columna=1; columna<=8; columna++){
                if((fila+columna == falfil+calfil) || (fila-columna == falfil-calfil)){
                    System.out.print("* ");
                }else if((fila+columna)%2==0){
                    System.out.print("B ");
                }else{
                    System.out.print("N ");
                }
                
            }
            System.out.println();


        }//end fila 



    }
    
}