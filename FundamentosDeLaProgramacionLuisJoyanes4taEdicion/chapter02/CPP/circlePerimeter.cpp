/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 28.Calular y visualizar el perimetro de la circunferencia y el area de un circulo.

    A=PI*r*r
    P = 2*PI*r
*/

#include<iostream>
using namespace std;

int main(){ 
    float r=0;          //Variable radio      
    float PI=3.1416;    //Variable PI
    float A=0;          //Variable Area
    float P=0;          //Variable Perimetro

    cout<<"Ingrese el radio de la circunferencia: ";
    cin>>r;

    A=PI*r*r;
    P=2*PI*r;

    cout<<"\nRadio: "<<r<<"\nArea: "<<A<<"\nPerimetro: "<<P<<"\n\n";
}