/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 10.Suma de los números pares comprendidos entre 2 y 100.
*/
public class SumUpOneHundred{

    public static void main(String[] args){
        int sum=0;

        for(int i=2; i<=100; i+=2){
            sum+=i;
        }

        System.out.println("La suma de los numeros pares del 2 al 100 es igual a: "+sum+"\n");
    }
}