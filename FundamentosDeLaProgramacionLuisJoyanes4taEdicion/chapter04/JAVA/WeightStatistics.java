/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 29.-Se desea realizar una estadística de los pesos de los alumnos de un colegio de acuerdo a la siguiente tabla:
                    
                    Alumnos de menos de 40 kg.
                    Alumnos entre 40 y 50 kg.
                    Alumnos de más de 50 kg y menos de 60 kg.
                    Alumnos de más o igual a 60 kg.
    Pagina 155
*/
import java.util.Scanner;
public class WeightStatistics{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float weigth;
        int weigth1=0, weigth2=0, weigth3=0, weigth4=0;
        char answer;   

        System.out.print("Programa que realiza una estadística de los pesos de los alumnos de un colegio de acuerdo a la siguiente tabla:");
        System.out.print("\n\nAlumnos de menos de 40 kg.\nAlumnos entre 40 y 50 kg.\nAlumnos de más de 50 kg y menos de 60 kg.\nAlumnos de más o igual a 60 kg.\n");

        do{
            System.out.print("\nIngresa el peso del alumno: ");
            weigth=in.nextFloat();

            if(weigth<40){
                weigth1++;
            }else if(weigth>=40 && weigth<=50){
                weigth2++;
            }else if(weigth>50 && weigth<60){
                weigth3++;
            }else if(weigth>=60){
                weigth4++;
            }

            System.out.print("\nPresione N para salir, presiones S para continuar\nDesea agregar el peso de otro estudiante?: ");
            answer=in.next().charAt(0);
        }while(answer!='N' && answer!='n');    

        System.out.print("\nAlumnos con peso menos de 40 kG: "+weigth1);
        System.out.print("\nAlumnos con peso de 40 kG-50KG: "+weigth2);
        System.out.print("\nAlumnos con peso mayor de 50 kG y menos de 60 KG: "+weigth3);
        System.out.print("\nAlumnos con peso igual o mayor a 60: "+weigth4+"\n");
    }
}    