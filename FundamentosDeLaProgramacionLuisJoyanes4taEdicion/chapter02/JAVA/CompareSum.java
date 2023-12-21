/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 13. Dados tres números, determinar si la suma de cualquier pareja de ellos es igual al tercer número.
    Si se cumple esta condición, escribir “Iguales” y, en caso contrario, escribir “Distintas”.

    En el caso de que los números sean: 3 9 6

    la respuesta es "Iguales", ya que 3 + 6 = 9. Sin embargo, si los números fueran:

    2 3 4
    
    el resultado sería "Distintas"
*/
import java.util.Scanner;
public class CompareSum{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=0;   //numero1
        int num2=0;   //numero2
        int num3=0;   //numero3
        int sum1=0;   //suma de numero1+numero2
        int sum2=0;   //suma de numero1+numero3
        int sum3=0;   //suma de numero2+numero3
        System.out.print("\nIngresa el primer numero: ");
        num1=in.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2=in.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        num3=in.nextInt();
        sum1=num1+num2;
        sum2=num1+num3;
        sum3=num2+num3;
        if(sum1==num3){
            System.out.print("\nSon iguales\n");
        }else if(sum2==num2){
            System.out.print("\nSon iguales\n");
        }else if(sum3==num1){
            System.out.print("\nSon iguales\n");
        }else{
            System.out.print("\nSon Distintos\n");
        }    
    }
}