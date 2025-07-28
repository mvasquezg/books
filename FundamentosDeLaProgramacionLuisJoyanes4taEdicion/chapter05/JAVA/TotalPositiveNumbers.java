/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 02.-Contar los números enteros positivos introducidos por teclado. Se consideran dos variables enteras numero 
                y contador (contará el número de enteros positivos). Se supone que se leen números positivos y se detiene 
                el bucle cuando se lee un número negativo o cero.
    Pagina 161
*/
import java.util.Scanner;
public class TotalPositiveNumbers{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=0, totalNumbers=0;
    
        System.out.print("Contar los números enteros positivos introducidos por teclado.\nSe supone que se leen números positivos y se detiene el bucle cuando se lee un número negativo o cero.");
        System.out.print("\n\nIngrese un numero: ");
       num=in.nextInt();
    
        while(num>0){
            totalNumbers++;
            System.out.print("Ingrese un numero: ");
           num=in.nextInt();
        }
    
        System.out.print("\nTotal de numeros positivos ingresados: "+totalNumbers+"\n");
    }
}
