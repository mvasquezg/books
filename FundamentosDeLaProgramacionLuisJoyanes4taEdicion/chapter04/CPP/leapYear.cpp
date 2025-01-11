/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 05.-Estructura selectiva para para averiguar si un año es o no bisiesto.
    Regla para obtener el año bisiesto:
    1.-Todos los año son divisibles entre 4.
    2.-Aquellos años que son divisibles entre 4, pero no entre 100, son bisiestos.
    3.-Los años que son divisibles entre 100, pero no entre 400, no son bisiestos.
    4.-Sin embargo, los años divisibles entre 100 y entre 400 sí que son bisiestos.
    ejemplo 4.7, pagina 136-137
*/
#include<iostream>
using namespace std;
int main(){
    int year=0;
    cout<<"Programa que determina si un año es bisiesto.\n\n";
    cout<<"Ingrese el anho: ";
    cin>>year;
    
    if(year%4==0){
        cout<<year<<" es un anho Bisiesto.\n";
    }else if(year%100==0){
        if(year%400==0){
            cout<<year<<" es un anho no Bisiesto.\n";
        }else{
            cout<<year<<" es un anho no Bisiesto.\n";
        }
    }else{
        cout<<year<<" es un anho no Bisiesto.\n";
    }
    cout<<"\n\n";
}