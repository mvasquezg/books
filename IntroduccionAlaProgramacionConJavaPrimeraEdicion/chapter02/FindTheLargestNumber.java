/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 2: Algoritmos y diseños 
 *Programa 9: Ejecutar varios juegos de encontrar el numero más grande.
*/
import java.util.Scanner;

public class FindTheLargestNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=0, mayorNumber=0, option=0;

        do{
            System.out.println("Inicia el Juego\n");
            do{
                System.out.print("Ingresa un numero positivo: ");
                num=in.nextInt();

                if(num>mayorNumber){
                    mayorNumber=num;
                }

            }while(num>=0);
        
            System.out.println("El numero mayor es: "+mayorNumber);

            System.out.print("\n\n****************\nDesea seguir jugando\n\n1.-Para continuar\n2.-Para salir\n\nIngresa la opcion: ");
            option=in.nextInt();
        }while(option!=2);
        
       
       
       
       
    }
}