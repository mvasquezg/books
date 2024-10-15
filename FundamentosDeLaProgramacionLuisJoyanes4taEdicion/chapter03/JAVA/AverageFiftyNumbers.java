/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 23.-Calcular la media de 50 numeros e imprimir el resultado
*/
import java.util.Scanner;

public class AverageFiftyNumbers{
    
    //constante
    static final int MAXVALUE=10;
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0, sum=0;
        float average=0;

        for(int i=1; i<=MAXVALUE; i++){
            System.out.print(i+".-Ingresa un numero: ");
            number=in.nextInt();
            sum+=number;
        }

        average=sum/MAXVALUE;

        System.out.print("Suma: "+sum+"\nPromedio: "+average+"\n");
    }
}    