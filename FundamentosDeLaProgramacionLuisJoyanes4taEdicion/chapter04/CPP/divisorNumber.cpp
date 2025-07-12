/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 30.-Realizar un programa que averigüe si dados dos números introducidos por teclado uno es divisor del otro.
    Pagina 155
*/
#include<iostream>
using namespace std;
int main(){
    int num1=0, num2=0;
    
    cout<<"Programa que averigüe si dados dos números introducidos por teclado uno es divisor del otro.\n";
    cout<<"\nIngresa el primer numero: ";
    cin>>num1;
    cout<<"Ingresa el segundo numero: ";
    cin>>num2;

    cout<<"\n";
    if(num1%num2==0){
        cout<<num2<<" es divisor de "<<num1;
    }else if(num2%num1==0){
        cout<<num1<<" es divisor de "<<num2;
    }else{
        cout<<"Los numeros "<<num1<<", "<<num2<<" no son divisibles uno del otro.";
    }
    cout<<"\n\n";
}