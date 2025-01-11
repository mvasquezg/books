/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 04.-Empleo de estructura selectiva para detectar si un numero tiene o no parte fraccionaria.
    ejemplo 4.6, pagina 136
*/
#include<iostream>
using namespace std;

//librearia que contiene la funcion trunc
#include<math.h>

int main(){
    
    float num=0;
    cout<<"\nPrograma que emplea de estructura selectiva para detectar si un numero tiene o no parte fraccionaria.";
    
    cout<<"\n\nIngresa un numero con decimales: ";
    cin>>num;

    if(num==trunc(num)){
        cout<<num<<" No tiene parte fraccionaria\n";
    }else{
        cout<<num<<" Tiene parte fraccionaria\n\n";
    }
}