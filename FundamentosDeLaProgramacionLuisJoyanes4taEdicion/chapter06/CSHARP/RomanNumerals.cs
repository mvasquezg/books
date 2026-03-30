/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 08.-Algoritmo que transforma un número introducido por teclado en notación decimal a romana. El número será entero
                 y positivo y no excederá de 3.000. 
    
    Ejemplo 9
    Pagina 212-213
*/

using System;

class RomanNumerals{
  
    static void convertToRomanNumeral(int digit, char v1, char v2, char v3){

        if(digit==9){
            System.Console.Write(v1+""+v3);
        }else if(digit>4){
            System.Console.Write(v2);

            for(int i=1; i<=digit-5; i++){
                System.Console.Write(v1);
            }
        }else if(digit==4){
            System.Console.Write(v1+""+v2);
        }else{ 
            for(int i=1; i<=digit; i++){
                System.Console.Write(v1);
            }   
        }    
    
    }
    
    public static void Main(string[] arg){
        int num=0;
        int r=0, digit=0;

        System.Console.Write("***** Programa que convierte un numero decimal a numero romano *****\n\n");

        do{
            System.Console.Write("Ingresa un numero entre 1-3000: ");
            num=int.Parse(System.Console.ReadLine());
        }while(num<=0 || num>3000); 

        //Millar
        r=num;
        digit=r/1000;
        r=r%1000;

        convertToRomanNumeral(digit, 'M', ' ', ' ');

        //Centena
        digit=r/100;
        r=r%100;

        convertToRomanNumeral(digit, 'C', 'D', 'M');

        //Decena
        digit=r/10;
        r=r%10;

        convertToRomanNumeral(digit, 'X', 'L', 'C');

        //Unidad
        digit=r;
        convertToRomanNumeral(digit, 'I', 'V', 'X');
    
        System.Console.Write("\n\n");       
    }
}