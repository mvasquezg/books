/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 21.Diseñar un algoritmo que lea y visualice una serie de números distintos de cero. 
    El algoritmo debe terminar con un valor cero que no se debe visualizar. 
    Visualizar el número de valores leídos.
*/
import java.util.Scanner;
public class CountNumbers{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;
        int countNumbers=0;

        do{
            System.out.print("Ingresa un numero: ");
            number=in.nextInt();

            if(number!=0){
                countNumbers++;
            }
        }while(number!=0);

        System.out.print("El total de numeros capturados es: "+countNumbers+"\n\n");
    }
}