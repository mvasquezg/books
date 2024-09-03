/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 4: Sentencias de control
 *Programa 1: Verifica que exista un punto al final de la oración.
 */
import java.util.Scanner;

public class PeriodAtTheEndTheSentence{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String sentence;
        int charLastPosition;

        System.out.print("Introduzca una oración: ");
        sentence=in.nextLine();

        charLastPosition=sentence.length()-1;

        if(sentence.charAt(charLastPosition)!='.'){
            System.out.println("Captura invalida: su oracion requiere un punto");
        }

    }   
}