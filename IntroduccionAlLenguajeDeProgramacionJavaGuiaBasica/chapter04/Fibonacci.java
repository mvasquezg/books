/** 
 *Libro: Introducción al lenguaje de programación Java. Una guía básica.
 *Capitulo 4: Estructuras de control en Java
 *Programa 4: Fibonacci funcion 
 */

public class Fibonacci{
    public static void main(String[] args){
        long n = Long.parseLong(args[0]);

        System.out.println("Secuencia Finonacci: "+n);

        fibonacci(n);
    }

    private static void fibonacci(long n){
        long fib=0;
        long a=0;
        long b=1;   
        
        for(int i=1; i<=n; i++){
            if(i == 1){
                System.out.print(a+", ");
            }else if(i==2){
                System.out.print(b+", ");
            }else{
                fib=a+b;
                System.out.print(fib+", ");
                a=b;
                b=fib;
            }
        }
        System.out.println();

    }
}