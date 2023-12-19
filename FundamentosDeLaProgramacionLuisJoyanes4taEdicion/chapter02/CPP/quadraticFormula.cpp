/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 08.Formula cuadratica
    
    x1 = –b + √((bb – 4ac)/2a)
    x2 = –b – √((bb – 4ac)/2a)
*/
#include<cmath>
#include<iostream>
using namespace std;
int main(){
    float a=0;
    float b=0;
    float c=0;
    float x1=0;
    float x2=0;

    cout<<"Ingresa el valor de A: ";
    cin>>a;

    cout<<"Ingresa el valor de B: ";
    cin>>b;

    cout<<"Ingresa el valor de C: ";
    cin>>c;

    x1=-(b + sqrt (b*b - (4*a*c))) / (2*a);
    x2=-(b - sqrt (b*b - (4*a*c))) / (2*a);

    cout<<"\n\nx1: "<<x1<<"\nx2: "<<x2<<"\n\n";
}