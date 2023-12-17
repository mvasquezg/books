/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 06.Realizar la suma de todos los números pares entre 2 y 1.000.
*/
public class SumEvenNumbers{
    public static void main(String[] args){
        int sum=0;

        for(int i=2; i<=1000; i+=2){
            sum+=i;
        }
        System.out.println("La suma de 2 en 2 al 1000 es igual a: "+sum+"\n");
    }
}    