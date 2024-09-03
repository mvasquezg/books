/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 2: Algoritmos y diseños 
 *Programa 3: Imprimir una de las cinco posibles letras empleadas para asignar calificación de acuerdo con cierta escala númerica.
    
    -- Mayor e igula a 90 A
    -- Mayor e igual a 80 B
    -- Mayor e igual a 70 C
    -- Mayor e igual a 60 D
    -- De lo contrario    E
*/
import java.util.Scanner;

public class LetterGrade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int cal=0;

        System.out.print("Ingresa una calificacion, del 10 al 100: ");
        cal=in.nextInt();

        if(cal>=90 && cal<=100){
            System.out.println("A");
        }else if(cal>=80 && cal<90){
            System.out.println("B");
        }else if(cal>=70 && cal<80){
            System.out.println("C");
        }else if(cal>=60 && cal<70){
            System.out.println("D");
        }else if(cal>=10 && cal<60){
            System.out.println("E");
        }else{
            System.out.println("La calificacion proporcionada no se encuentra en el rango 10--100");
        }
        

    }
}
