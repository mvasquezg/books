/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 05.-Resolver las operaciones de los parentesis primero.
					
					1) A * (B + 3)
					
					2) (A*B) + 3
					
					3) A + (B + C) + D

					4) (A+B/C) + D
					
					5) A*B/C * D   
*/
#include<iostream>
using namespace std;
int main(){
    int a=0, b=0, c=0, d=0;

    cout<<"Ingresa el valor de A: ";
    cin>>a;

    cout<<"Ingresa el valor de B: ";
    cin>>b;

    cout<<"Ingresa el valor de C: ";
    cin>>c;

    cout<<"Ingresa el valor de D: ";
    cin>>d;

    cout<<"\nA * (B + 3) = "<<a*(b+3)<<"\n\n";
					
	cout<<"(A * B) + 3 = "<<(a * b) + 3<<"\n\n";
					
	cout<<"A + (B + C) + D = "<<(a + (b + c) + d)<<"\n\n"; 

	cout<<"(A+B/C) + D = "<<((a+b/c) + d)<<"\n\n";
					
	cout<<"A*B/C*D = "<<(a*b/c*d)<<"\n\n";
    return 0;
}