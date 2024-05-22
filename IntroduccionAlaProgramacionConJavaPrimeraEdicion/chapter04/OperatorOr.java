/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 4: Sentencias de control
 *Programa 4: Operador OR (||).
 */
import java.util.Scanner;

public class OperatorOr{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String answer;
        
        System.out.print("Introduzca s o S: ");
        answer=in.nextLine();

        //Incorrecto para comparar un String
        /*if(answer=="s" && answer=="S"){
            System.out.println("Adios!");
        }*/

        //aplicando el operador OR
        if(answer.equals("s") || answer.equals("S")){
            System.out.println("Adios!");
        }





    }   
}