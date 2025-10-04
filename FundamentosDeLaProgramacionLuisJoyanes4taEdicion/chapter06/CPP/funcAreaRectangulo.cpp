/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 01.-Calcular la superficie (área) de un rectángulo, usando funciones.
    
    Ejemplo1
    Pagina 202
*/
#include<iostream>
using namespace std;

float calculateArea(float base, float altura){
    return base*altura;
}

int main(){
    float base=0, altura=0;

   cout<<"Programa que calcula el area de un rectangulo, usando una funcion:\n\nIngresa la base del rectangulo: ";
   cin>>base;
   cout<<"Ingresa la altura del rectangulo: ";
   cin>>altura;

   cout<<"El area del rectanglo es igual a: "<<calculateArea(base, altura)<<"\n\n";    
}