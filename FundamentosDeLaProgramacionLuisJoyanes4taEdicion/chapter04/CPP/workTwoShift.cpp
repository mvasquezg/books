/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 17.-Los empleados de una fabrica trabajan en dos turnos. Se desea calcular el jornal diario de acuerdo con los siguiente puntos:
        1.-La tarifa de las horas diurnas es de 5 euros.
        2.-La tarifa de las horas nocturnas es de 8 euros.
        3.-Caso de ser domingo, la tarifa se incrementara en 2 euros el turno diurno y 3 horas el turno nocturno.
    Actividades de programacion Resueltas
    4.3, Pagina 151
*/
#include<iostream>
using namespace std;
#define DAY_SHIFT_PRICE 5
#define NIGHT_SHIFT_PRICE 8
#define SUNDAY_DAY_SHIFT_PRICE 2
#define SUNDAY_NIGHT_SHIFT_PRICE 3
int main(){
    int shift=0, salary=0, salarySunday=0, total=0, hoursWorked=0, hoursWorkedSunday=0;
    
    cout<<"Programa que calcula el jornal diario de un trabajador de acuerdo a lo siguiente: ";
    cout<<"\n1.-La tarifa de las horas diurnas es de 5 euros";
    cout<<"\n2.-La tarifa de las horas nocturnas es de 8 euros";
    cout<<"\n3.-En caso de ser domingo, la tarifa se incrementara en 2 euros el turno diurno y 3 horas el turno nocturno.";
    cout<<"\n\nIngresa el turno del trabajador:\n1.-Diurno\n2.-Nocturno\nOpcion: ";
    cin>>shift;
    cout<<"\nIngresa las horas trabajadas: ";
    cin>>hoursWorked;
    cout<<"Ingresa horas trabajadas en domingo: ";
    cin>>hoursWorkedSunday;
    if(shift==1){
        salary=hoursWorked*DAY_SHIFT_PRICE;
    }else if(shift==2){
        salary=hoursWorked*NIGHT_SHIFT_PRICE;
    }

    if(hoursWorkedSunday!=0){
        if(shift==1){
            salarySunday=hoursWorkedSunday*SUNDAY_DAY_SHIFT_PRICE;
        }else{
            salarySunday=hoursWorkedSunday*SUNDAY_NIGHT_SHIFT_PRICE;
        }
    }
    total=salary+salarySunday;    
    cout<<"\n\nEl trabajador acumulo "<<hoursWorked<<" horas trabajadas\n";
    cout<<"El trabajador acumulo "<<hoursWorkedSunday<<" horas trabajadas en domingo\n";
    cout<<"Salario Normal:  $ "<<salary<<"\n";
    cout<<"Salario domimgo:  $ "<<salarySunday<<"\n";
    cout<<"Total de Salario:  $ "<<total<<"\n";
}