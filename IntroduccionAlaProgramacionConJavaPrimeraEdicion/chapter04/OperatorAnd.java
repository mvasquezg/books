/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 4: Sentencias de control
 *Programa 2: Uso del operado and (&&)
 */
import java.util.Scanner;

public class OperatorAnd{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        double temp=0;
        
        System.out.print("Introduzca la temperatura: ");
        temp=in.nextDouble();

        if(temp>=10 && temp<=32){
            System.out.println("Temperatura Adecuada.");
        }else{
            System.out.println("Temperatura No Adecuada.");
        }

    }   
}