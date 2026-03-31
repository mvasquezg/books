/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 12.-La función triángulo calcula el área de un triángulo en C++
    
    Ejemplo 6.15
    Pagina 232-233
*/
#include<iostream>
using namespace std;

float calcArea(float base, float heigth){
    return (base*heigth)/2;
}

int main(){
    float base=0.0, heigth=0.0;

    cout<<"**** Programa que calcula el area de un triangulo ***";
    cout<<"\n\nIngresa el valor de la base: ";
    cin>>base;
    cout<<"Ingresa el valor de la altura: ";
    cin>>heigth;

    cout<<"\nArea: "<<calcArea(base, heigth)<<"\n\n";
}