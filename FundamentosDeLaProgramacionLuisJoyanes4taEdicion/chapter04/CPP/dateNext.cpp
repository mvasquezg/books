/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 28.-Diseñar un programa en el que a partir de una fecha introducida por teclado con el formato DIA, MES,
    AÑO se obtenga la fecha del día siguiente.

    Ejercicios:
    4.6  página 155 
*/
#include<iostream>
using namespace std;

int main(){
    int year=0, month=0, day=0;
    int leapYear=0; //para validar el año bisiesto

    cout<<"Programa en el que a partir de una fecha introducida por teclado con el formato DIA, MES, AÑO se obtenga la fecha del día siguiente.\n\n";

    do{
        cout<<"Ingrese anho entre 1900-2025: ";
        cin>>year;
    }while(year<1900 || year>2025);
    
    cout<<"\n\n";
    do{
        cout<<"Ingrese mes entre 1-12: ";
        cin>>month;
    }while(month<1 || month>12);
    cout<<"\n\n";
    
    if(month==2){
        
        if( ((year%4==0) || (year%100==4 && year%400==0))){
            do{
                cout<<"Ingresa un dia entre 1-29: ";
                cin>>day;
            }while((day<1 || day>29));

            leapYear=1;
        }else{
            do{
                cout<<"Ingresa un dia entre 1-28: ";
                cin>>day;
            }while((day<1 || day>28));
        }
    }else if(month==1 || month==3 || month == 5 || month==7 || month == 8 || month==10 || month==12){
        do{
            cout<<"Ingresa un dia entre 1-31: ";
            cin>>day;
        }while((day<1 || day>31));
    }else if(month==4 || month==6 || month == 9 || month==11){
        do{
            cout<<"Ingresa un dia entre 1-30: ";
            cin>>day;
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

    cout<<"\n\n";
    cout<<"Fecha dia siguiente: \nDia: "<<day<<"\nMes: "<<month<<"\nAnho: "<<year;

    cout<<"\n\n";
    
}