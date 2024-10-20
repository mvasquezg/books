/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 27.-Calcular la nota media de los alumnos de una clase considerando n-numero de alumnos
    y c-numero de calificaciones de cada alumno.
*/
#include<iostream>
using namespace std;
int main(){
    int numStudents=0, numCal=0, sumCal=0, cal;
    float promCal=0;
    cout<<"Ingrese la cantidad de alumnos: ";
    cin>>numStudents;
    cout<<"Ingrese el numero de calificaciones por alumno: ";
    cin>>numCal;
    cout<<"\n";

    for(int i=1; i<=numStudents; i++){
        sumCal=0;
        for(int j=1; j<=numCal; j++){
            cout<<j<<".-Ingresa la calificacion del alumno "<<i<<": ";
            cin>>cal;
            sumCal+=cal;
        }
        promCal=sumCal/numCal;    
        cout<<"\nEl promedio del alumno "<<i<<" es: "<<promCal<<"\n"; 
        cout<<"\n";
    }
    cout<<"\n\n";
}

