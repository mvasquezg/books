/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 04.-Convertir en expresiones aritméticas algorítmicas las siguientes expresiones algebraicas:
					
					1) 5 ∙ (x + y)
					
					2) x + y/ (u+ w/a)
					
					3) a^2 + b^2
					
					4) x/y * (z + w)   
*/  
#include<math.h>
#include<iostream>
using namespace std;
int main(){
    int a=0, b=0, u=0, w=0, x=0, y=0, z=0;

    cout<<"Ingresa el valor de a: ";
    cin>>a;

    cout<<"Ingresa el valor de b: ";
    cin>>b;

    cout<<"Ingresa el valor de u: ";
    cin>>u;    

    cout<<"Ingresa el valor de w: ";
    cin>>w;

    cout<<"Ingresa el valor de x: ";
    cin>>x;

    cout<<"Ingresa el valor de y: ";
    cin>>y;

    cout<<"Ingresa el valor de z: ";
    cin>>z;

    cout<<"\n5 ∙ (x + y) = "<<5*(x+y)<<"\n\n";
    cout<<"a^2 + b^2 = "<<(pow(a, 2)+pow(b, 2))<<"\n\n";
    cout<<"x + y / (u + w/a) = "<<((x+y)/(u+(w/a)))<<"\n\n";
    cout<<"x/y * (z + w)  = "<<((x/y)*(z+w))<<"\n\n";
}
