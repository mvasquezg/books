/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 06.-Algoritmo que contiene y utiliza unas funciones (seno y coseno) a las que les podemos pasar el ángulo en grados.
    
    Ejemplo 6
    Pagina 208
*/
#include<iostream>
#include<math.h>
using namespace std;

float calculateSin(float degree){
    return sin(degree*2*3.1416/360);
}

float calculateCosine(float degree){
    return cos(degree*2*3.1416/360);
}


int main(){
    float degree;

    cout<<"Programa que calcula el seno y el coseno de un angulo en grados:\n";
    cout<<"Ingresa el angulo en grado: ";
    cin>>degree;

    cout<<"\nEl seno de "<<degree <<" es igual a: "<<calculateSin(degree)<<"\n";
    cout<<"\nEl coseno de "<<degree <<" es igual a: "<<calculateCosine(degree)<<"\n";
}