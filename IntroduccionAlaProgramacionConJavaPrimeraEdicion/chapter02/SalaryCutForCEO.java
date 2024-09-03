/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 2: Algoritmos y diseños 
 *Programa 4: Recorte de Salario de un director general a la mitad si sueldo es mayor e igual a 500 mil al mes.
*/
import java.util.Scanner;

public class SalaryCutForCEO{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double salary=0;

        System.out.print("Ingresa el salario mensual del director general: ");
        salary=in.nextDouble();

        if(salary>=500000){
            System.out.println("El nuevo salario del Director es: " + (salary*0.5));
        }else{
            System.out.println("El salario del director se mantiene: " + salary);
        }

    }
}
