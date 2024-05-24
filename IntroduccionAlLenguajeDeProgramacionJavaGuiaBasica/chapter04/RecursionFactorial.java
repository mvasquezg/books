/** 
 *Libro: Introducción al lenguaje de programación Java. Una guía básica.
 *Capitulo 4: Estructuras de control en Java
 *Programa 3: Factorial con recursividad
 */

public class RecursionFactorial{
    public static void main(String[] args){
        long n = Long.parseLong(args[0]);

        System.out.println("El factorial de "+n+" es: "+Factorial(n));
    }

    private static long Factorial(long n){
        long result;

        if(n>0){
            result=n*Factorial(n-1);
        }else{
            result=1;
        }

        return result;

    }
}