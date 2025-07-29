/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 03.-Obtener un algoritmo que lea un número (por ejemplo, 198) y obtenga el número inverso (por ejemplo, 891).
    Pagina 166
*/

import java.util.Scanner;
public class InverseNumber{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=0, inverseNumber=0;

        System.out.print("Programa que lee un número (por ejemplo, 198) y obtenga el número inverso (por ejemplo, 891).\n\nIngresa un numero: ");
        num=in.nextInt();

        System.out.print("\nNumero Inverso: ");
        do{
            inverseNumber=num%10;
            System.out.print(inverseNumber);
            num=num/10;
        }while(num>0);
        System.out.print("\n");
    }
}    