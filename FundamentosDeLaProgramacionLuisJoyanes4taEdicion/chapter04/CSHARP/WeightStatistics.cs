/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 29.-Se desea realizar una estadística de los pesos de los alumnos de un colegio de acuerdo a la siguiente tabla:
                    
                    Alumnos de menos de 40 kg.
                    Alumnos entre 40 y 50 kg.
                    Alumnos de más de 50 kg y menos de 60 kg.
                    Alumnos de más o igual a 60 kg.
    Pagina 155
*/
using System;
class WeightStatistics{    
    public static void Main(string[] args){
        float weigth;
        int weigth1=0, weigth2=0, weigth3=0, weigth4=0;
        char answer;   

        System.Console.Write("Programa que realiza una estadística de los pesos de los alumnos de un colegio de acuerdo a la siguiente tabla:");
        System.Console.Write("\n\nAlumnos de menos de 40 kg.\nAlumnos entre 40 y 50 kg.\nAlumnos de más de 50 kg y menos de 60 kg.\nAlumnos de más o igual a 60 kg.\n");

        do{
            System.Console.Write("\nIngresa el peso del alumno: ");
            weigth=float.Parse(System.Console.ReadLine());

            if(weigth<40){
                weigth1++;
            }else if(weigth>=40 && weigth<=50){
                weigth2++;
            }else if(weigth>50 && weigth<60){
                weigth3++;
            }else if(weigth>=60){
                weigth4++;
            }

            System.Console.Write("\nPresione N para salir, presiones S para continuar\nDesea agregar el peso de otro estudiante?: ");
            answer=Convert.ToChar(System.Console.ReadLine());
        }while(answer!='N' && answer!='n');    

        System.Console.Write("\nAlumnos con peso menos de 40 kG: "+weigth1);
        System.Console.Write("\nAlumnos con peso de 40 kG-50KG: "+weigth2);
        System.Console.Write("\nAlumnos con peso mayor de 50 kG y menos de 60 KG: "+weigth3);
        System.Console.Write("\nAlumnos con peso igual o mayor a 60: "+weigth4+"\n");
    }
}    