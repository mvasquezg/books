/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 29.-Escribir un algoritmo que encuentre el salario semanal de un trabajador, 
    dada la tarifa horaria y el número de horas trabajadas diariamente.
*/
#include<iostream>
using namespace std;

int main(){
    int pricePerHour=0;
    int hoursWorked=0;
    int sumHours=0;
    int salary=0;

    cout<<"Ingresa el precio por hora: ";
    cin>>pricePerHour;

    for(int i=1; i<=7; i++){
        cout<<"Ingresa horas trabajdas del dia "<<i<<": ";
        cin>>hoursWorked;

        sumHours+=hoursWorked;
    }

    salary=sumHours*pricePerHour;

    cout<<"\nHoras trabajadas en la semana: "<<sumHours<<"\nSalario semanal del trabajador: $ "<<salary<<"\n";
}