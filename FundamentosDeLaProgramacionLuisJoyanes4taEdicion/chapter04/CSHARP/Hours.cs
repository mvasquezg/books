/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 14.-Algoritmo al que le damos la HH, MM, SS. y nos calcule la hora dentro de un segundo.
    Leeremos las horas, minutos y segundos como numeros enteros. 
    ejemplo 4.18, Pagina 148
*/

using System;
class Hours{
    public static void Main(string[] args){
        int h=0, m=0, s=0;
        System.Console.Write("Programa al que le damos la HH, MM, SS. y nos calcule la hora dentro de un segundo");
        System.Console.Write("\n\ningrese la hora: ");
        h=int.Parse(System.Console.ReadLine());
        System.Console.Write("ingrese los mm: ");
        m=int.Parse(System.Console.ReadLine());
        System.Console.Write("ingrese los segundos: ");
        s=int.Parse(System.Console.ReadLine());

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
        System.Console.Write("La hora es:  "+h+":"+m+":"+s+" hrs\n\n");
    }
}