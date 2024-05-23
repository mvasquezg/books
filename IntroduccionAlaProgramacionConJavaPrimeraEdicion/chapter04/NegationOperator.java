/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 4: Sentencias de control
 *Programa 5: Operador Negacion (!).
 */
import java.util.Scanner;

public class NegationOperator{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String answer;
        
        System.out.print("Introduzca s o S: ");
        answer=in.nextLine();

        //aplicando el operador Not (Negacion !)
        if( !(answer.equals("s") || answer.equals("S"))){
            System.out.println("Comencemos...!");
        }

    }   
}