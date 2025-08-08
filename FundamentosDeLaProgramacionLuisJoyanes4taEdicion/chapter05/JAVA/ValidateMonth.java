/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 08.-Es muy frecuente tener que realizar validación de entrada de datos en la mayoría de las aplicaciones. Este ejemplo
                 detecta cualquier entrada comprendida entre 1 y 12, rechazando las restantes, ya que se trata de leer los números
                 correspondientes a los meses del año. 
    Pagina 171
*/

import java.util.Scanner;

public class ValidateMonth{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int month=0;

        System.out.print("Ingresa un numero de mes 1-12, con cualquier otro numero se sale del programa.\n");
        do{
            System.out.print("\nIngrese el numero: ");
            month=in.nextInt();
        }while(month>=1 && month<=12);
    }
}
