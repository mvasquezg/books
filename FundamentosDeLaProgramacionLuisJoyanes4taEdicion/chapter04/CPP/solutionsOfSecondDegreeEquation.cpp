/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 13.-Pseudocodigo que nos permita calcular las soluciones de una ecuacion de segundo grado, incluyendo
    los valores imaginarios.
    ejemplo 4.17, Pagina 147
*/
#include<math.h>
#include<stdlib.h>
#include<iostream>
using namespace std;
int main(){
    float a=0, b=0, c=0, d=0, x1=0, x2=0, r=0, i=0;
    cout<<"Programa que nos permita calcular las soluciones de una ecuacion de segundo grado, incluyendo los valores imaginarios.";
    cout<<"\n\nIngrese los coeficientes: ";
    cout<<"\nIngrese el valor de A: ";
    cin>>a;
    cout<<"Ingrese el valor de B: ";
    cin>>b;
    cout<<"Ingrese el valor de C: ";
    cin>>c;

    if(a==0){
        cout<<"La ecuacion no es de segundo grado.\n";
    }else{
        d=b*b-4*a*c;

        if(d==0){
            x1= -b/(2+a);
            x2=x1;
            cout<<"\nLos valores son para:\nx1="<<x1<<"\nx2="<<x2;

        }else if(d>0){
            x1=(-b +sqrt(d)) / (2*a);
            x2=(-b -sqrt(d)) / (2*a);
            cout<<"\nLos valores son para:\nx1="<<x1<<"\nx2="<<x2;
        }else{
            r=(-b)/(2*a);
            int dAbs=(int)(d);
            int absNum=abs(dAbs);
            i=sqrt(absNum) /(2*a);
            cout<<"\n\nLos valores son para:\nr="<<r<<" + "<<i<<"i";
            cout<<"\n\nLos valores son para:\nr="<<r<<" - "<<i<<"i";
        }
    }
    cout<<"\n\n";

}
