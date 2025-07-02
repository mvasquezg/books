/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 28.-Diseñar un programa en el que a partir de una fecha introducida por teclado con el formato DIA, MES,
    AÑO se obtenga la fecha del día siguiente.

    Ejercicios:
    4.6  página 155 
*/
using System;

class DateNext{
    public static void Main(string[] args){
        int year=0, month=0, day=0;
        int leapYear=0; //para validar el año bisiesto

        System.Console.Write("Programa en el que a partir de una fecha introducida por teclado con el formato DIA, MES, AÑO se obtenga la fecha del día siguiente.\n\n");

        do{
            System.Console.Write("Ingrese anho entre 1900-2025: ");
            year=int.Parse(System.Console.ReadLine());
        }while(year<1900 || year>2025);

        System.Console.Write("\n\n");
        do{
            System.Console.Write("Ingrese mes entre 1-12: ");
            month=int.Parse(System.Console.ReadLine());;
        }while(month<1 || month>12);
        System.Console.Write("\n\n");

        if(month==2){

            if( ((year%4==0) || (year%100==4 && year%400==0))){
                do{
                    System.Console.Write("Ingresa un dia entre 1-29: ");
                    day=int.Parse(System.Console.ReadLine());
                }while((day<1 || day>29));

                leapYear=1;
            }else{
                do{
                    System.Console.Write("Ingresa un dia entre 1-28: ");
                    day=int.Parse(System.Console.ReadLine());
                }while((day<1 || day>28));
            }
        }else if(month==1 || month==3 || month == 5 || month==7 || month == 8 || month==10 || month==12){
            do{
                System.Console.Write("Ingresa un dia entre 1-31: ");
                day=int.Parse(System.Console.ReadLine());;
            }while((day<1 || day>31));
        }else if(month==4 || month==6 || month == 9 || month==11){
            do{
                System.Console.Write("Ingresa un dia entre 1-30: ");
                day=int.Parse(System.Console.ReadLine());;
            }while((day<1 || day>30));
        }

        if(month==2 && leapYear==1){
            if(day==29){
                month++;
                day=1;
            }else{
                day++;
            }
        }else if(month==2 && leapYear==0){
            if(day==28){
                month++;
                day=1;
            }else{
                day++;
            }
        }else if((month==1 || month==3 || month == 5 || month==7 || month == 8 || month==10)){

                if(day!=31){
                    day++;
                }else{
                    month++;
                    day=1;
                }            
        }else if(month==12){
                if(day!=31){
                    day++;
                }else{
                    month=1;
                    day=1;
                    year++;
                }
        }else if((month==4 || month==6 || month == 9 || month==11)){
            if(day!=30){
                day++;
            }else{
                month++;
                day=1;
            }    
        }   

        System.Console.Write("\n\n");
        System.Console.Write("Fecha dia siguiente: \nDia: "+day+"\nMes: "+month+"\nAnho: "+year);

        System.Console.Write("\n\n");

    }
}    