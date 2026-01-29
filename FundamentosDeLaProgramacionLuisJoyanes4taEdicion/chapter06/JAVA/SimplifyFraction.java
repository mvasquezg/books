/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 06.-Algoritmo que simplifique un quebrado, dividiendo numerador y denominador por su máximo común divisor.
    
    Ejemplo 7
    Pagina 208-209
*/
import java.util.Scanner;

public class SimplifyFraction{

    static int showMcd(int numerator, int denominator){
        int dividendo=0, divisor=0;

        if(numerator%denominator==0){
            return denominator;
        }else{
            dividendo=denominator;
            divisor=numerator%denominator;
            return showMcd(dividendo, divisor);
        }   
    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        int numerator=0, denominator=0, mcd=0;
    
        System.out.print("Ingresa el numerador: ");
        numerator=in.nextInt();

        System.out.print("Ingresa el denominador: ");
        denominator=in.nextInt();

        mcd=showMcd(numerator, denominator);

        System.out.print("\nFraccion: "+numerator+" / "+denominator+"\nMCD: "+mcd+"\n");

        System.out.print("\nFraccion simplificada: "+(numerator/mcd)+" / "+(denominator/mcd)+"\n");

    }

}