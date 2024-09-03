/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 2: Algoritmos y diseños 
 *Programa 7: Imprimir calido, si la temperatura esta arriba de los 27 grados, adecuado si esta entre 10 y 27 e mostra frio si es menor de 10.
*/

import java.util.Scanner;

public class ThreeTemperatureOptions{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double temp=0;

        System.out.print("Ingrese la temperarura: ");
        temp=in.nextDouble();

        if(temp>27){
            System.out.println(temp + "  La temperatura es calida");
        }else if(temp>=10 && temp<=27){
            System.out.println(temp + "  La temperatura es adecuada");
        }else{
            System.out.println(temp + "  La temperatura es fria");
        }
    }
}