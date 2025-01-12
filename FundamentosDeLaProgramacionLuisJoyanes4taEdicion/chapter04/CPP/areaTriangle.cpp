/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 06.-Programa que nos calcule el area de un triangulo conociendo sus lados. 
    La estructura selectiva se utiliza para el control de entrada de datos del programa.

    Nota: 
    Area = sqrt(P * (P-a) * (P-b) * (P-c))
    P = (a + b + c)/2

    donde P>a y P>b y P>c, sino se cumple la condicion entonces no es un triangulo.

    ejemplo 4.8, Pagina 138
*/
#include<iostream>
#include<math.h>
using namespace std;
int main(){
    float Area=0, P=0, a=0, b=0, c=0;
    cout<<"Programa que nos calcule el area de un triangulo conociendo sus lados.\n"; 
    //cout<<"La estructura selectiva se utiliza para el control de entrada de datos del programa.";
    cout<<"\n\nNota: Area = sqrt(P * (P-a) * (P-b) * (P-c))\nP = (a + b + c)/2\n";
    cout<<"\n\nDonde P>a y P>b y P>c, sino se cumple la condicion entonces no es un triangulo.";
    cout<<"\nIngresa el valor de a: ";
    cin>>a;
    cout<<"Ingresa el valor de b: ";
    cin>>b;
    cout<<"Ingresa el valor de c: ";
    cin>>c;
    P=(a+b+c)/2;
    if(P>a && P>b && P>c){
        Area= sqrt(P * (P-a) * (P-b) * (P-c));
    }
    if(Area!=0){
        cout<<"\nEl area es igual a: "<<Area;
    }else{
        cout<<"No es un triangulo.";
    }    
    cout<<"\n\n";
}