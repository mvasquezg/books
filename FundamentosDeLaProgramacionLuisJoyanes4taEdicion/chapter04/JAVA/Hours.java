/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 14.-Algoritmo al que le damos la HH, MM, SS. y nos calcule la hora dentro de un segundo.
    Leeremos las horas, minutos y segundos como numeros enteros. 
    ejemplo 4.18, Pagina 148
*/
import java.util.Scanner;
public class Hours{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int h=0, m=0, s=0;
        System.out.print("Programa al que le damos la HH, MM, SS. y nos calcule la hora dentro de un segundo");
        System.out.print("\n\ningrese la hora: ");
        h=in.nextInt();
        System.out.print("ingrese los mm: ");
        m=in.nextInt();
        System.out.print("ingrese los segundos: ");
        s=in.nextInt();

        if(h<=24 && m<=60 && s<=60){
            s=s+1;

            if(s==60){
                s=0;
                m=m+1;

                if(m==60){
                    m=0;
                    h=h+1;
                }

                if(h==24){
                    h=00;
                }
            }
        }
        System.out.print("La hora es:  "+h+":"+m+":"+s+" hrs\n\n");
    }
}