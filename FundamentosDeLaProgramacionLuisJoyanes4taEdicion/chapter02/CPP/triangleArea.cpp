/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 27.Escribir un algoritmo que calcule la superficie de un triángulo en función de la base y la altura 
    (S = 1/2Base × Altura)
*/

#include<iostream>
using namespace std;
int main(){
    float b=0; //base
    float h=0; //altura
    float area=0; //area del triagulo

    cout<<"Ingrese la base del triangulo: ";
    cin>>b;

    cout<<"Ingrese la altura del triangulo: ";
    cin>>h; 

    area=(b*h)/2;

    cout<<"El area del tiangulo es igual a: "<<area<<"\n";   
}