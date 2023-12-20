/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 09.Calcular el promedio de una serie de números positivos. 
    Un valor de cero indicará que se ha alcanzado el final de la serie de números positivos
*/
import java.util.Scanner;

public class AveragePositiveNumber{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;
        int average=0;
        int count=0;
        int sum=0;
          
        do{
            System.out.print("Ingresa un numero: ");
            number=in.nextInt();
            
            if(number>0){
                sum+=number;
                count++;
            }

        }while(number>0 || number<0);
    
        average=sum/count;

        System.out.print("\n\nSuma: "+sum+"\nNumeros positvos ingresados: "+count+"\nPromedio: "+average+"\n\n");
    }
}