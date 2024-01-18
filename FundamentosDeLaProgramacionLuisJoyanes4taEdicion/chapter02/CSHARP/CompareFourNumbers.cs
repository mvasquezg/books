/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 023.-Escribir un algoritmo que lea cuatro números y a continuación visualice el mayor de los cuatro
*/
using System;
class CompareFourNumber{
    public static void Main(string[] args){
        int a; //Numero 1
        int b; //Numero 2
        int c; //Numero 3
        int d; //Numero 4

        System.Console.Write("Ingresa el primer numero: ");
        a=int.Parse(System.Console.ReadLine());
        System.Console.Write("Ingresa el segundo numero: ");
        b=int.Parse(System.Console.ReadLine());
        System.Console.Write("Ingresa el tercer numero: ");
        c=int.Parse(System.Console.ReadLine());
        System.Console.Write("Ingresa el cuarto numero: ");
        d=int.Parse(System.Console.ReadLine());

        if(a==b){
            if(b==c){
                if(c==d){
                    System.Console.Write("Los numeros A="+a+" B="+b+", C="+c+", D="+d+". Son iguales\n\n");
                }else if(c>d){
                    System.Console.Write("Los numeros A="+a+" B="+b+" C="+c+" Son iguales y mayores que D="+d+"\n\n");
                }else{
                    System.Console.Write("El numero D="+d+" es mayor que A="+a+", B="+b+", C="+c+"\n\n");
                }
            }else if(b>c){
                if(b==d){
                    System.Console.Write("Los numeros A="+a+", B="+b+", D="+d+" son mayores que C="+c+"\n\n");
                }else if(b>d){
                    System.Console.Write("Los numeros A="+a+", B="+b+", son mayores que C="+c+", D="+d+"\n\n");
                }else{
                    System.Console.Write("El numero D="+d+" es mayor que A="+a+", B="+b+", C="+c+"\n\n");
                }
            }else{
                if(c==d){
                    System.Console.Write("Los numeros C="+c+", D="+d+" son mayores que A="+a+", B="+b+"\n\n");
                }else if(c>d){
                    System.Console.Write("El numero C="+c+" es mayor que A="+a+", B="+b+", D="+d+"\n\n");
                }else{
                    System.Console.Write("El numero D="+d+" es mayor que A="+a+", B="+b+", C="+c+"\n\n");
                }
            }
        }else if(a>b){
            if(a==c){
                if(c==d){
                    System.Console.Write("Los numeros que A="+a+", C="+c+", D="+d+", son mayores que B="+b+"\n\n");
                }else if(c>d){
                    System.Console.Write("Los numeros que A="+a+", C="+c+", son mayores que B="+b+", D="+d+"\n\n");
                }else{
                    System.Console.Write("El numero D="+d+", es mayor que A="+a+", B="+b+", C="+c+"\n\n");
                }
            }else if(a>c){
                if(a==d){
                    System.Console.Write("Los numeros A="+a+", D="+d+" son mayores que B="+b+", C="+c+"\n\n");
                }else if(a>d){
                    System.Console.Write("El numero A="+a+", es mayor que B="+b+", C="+c+", D="+d+"\n\n");
                }else{
                    System.Console.Write("El numero D="+d+", es mayor que  A="+a+", B="+b+", C="+c+"\n\n");
                }
            }else{
                if(c==d){
                    System.Console.Write("Los numeros C="+c+", D="+d+" son mayores que A="+a+", B="+b+".\n\n"); 
                }else if(c>d){
                    System.Console.Write("El numero C="+c+" es mayor que A="+a+", B="+b+", D="+d+".\n\n"); 
                }else{
                    System.Console.Write("El numero D="+d+" es mayor que A="+a+", B="+b+", C="+c+".\n\n"); 
                }
            }
        }else{
            if(b==c){
                if(c==d){
                    System.Console.Write("Los numeros B="+b+", C="+c+", D="+d+" son mayores que A="+a+".\n\n"); 
                }else if(c>d){
                    System.Console.Write("Los numeros B="+b+", C="+c+" son mayores que A="+a+", D="+d+".\n\n"); 
                }else{
                    System.Console.Write("El numero D="+d+" es mayor que A="+a+", B="+b+", C="+c+".\n\n"); 
                }
            }else if(b>c){
                if(b==d){
                    System.Console.Write("Los numeros B="+b+", D="+d+" son mayores que A="+a+", C="+c+".\n\n"); 
                }else if(b>d){
                    System.Console.Write("El numero B="+b+" es mayor que A="+a+", C="+c+" D="+d+".\n\n"); 
                }else{
                    System.Console.Write("El numero D="+d+" es mayor que A="+a+", B="+b+" C="+c+".\n\n"); 
                }            
            }else{
                if(c==d){
                    System.Console.Write("Los numeros C="+c+", D="+d+" son mayores que A="+a+", B="+b+".\n\n"); 
                }else if(c>d){
                    System.Console.Write("El numero C="+c+" es mayor que A="+a+", B="+b+" D="+d+".\n\n"); 
                }else{
                    System.Console.Write("El numero D="+d+" es mayor que A="+a+", B="+b+" C="+c+".\n\n"); 
                }
            }
        }
    }
}   