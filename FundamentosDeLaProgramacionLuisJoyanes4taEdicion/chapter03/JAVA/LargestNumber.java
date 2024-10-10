    /*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 15.-Elabora un programa que permita leer una serie de numeros distintos de cero (el ultimo numero de la serie es -99) y obtener el numero mayor. Como resultado se debe visualizar el numero mayor y un mensaje de indicacion de numero negativo, caso que se haya leido un numero negativo
*/
import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int largestNumber=0, number=0;
        System.out.print("Programa que determina el numero mayor de una serie de numeros.\n\nPresione -99 para salir.\n\n");
        do{
            System.out.print("Ingresa un numero: ");
            number=in.nextInt();

            if(number>largestNumber){
                largestNumber=number;
            }

            if(number<0 && number!=-99){
                System.out.print(number+" numero negativo.\n");
            }

        }while(number!=-99);

        if(largestNumber!=0){
            System.out.print("El numero mayor de la serie es: "+largestNumber+"\n");
        }   
    }
}