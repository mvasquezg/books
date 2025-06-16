/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 27.-Escribir los diferentes métodos para deducir si una variable o expresión numérica es par.

    Ejercicios:
    4.5  página 155 
*/
#include<iostream>
using namespace std;

int main(){
    int num=0;

    cout<<"Escribir los diferentes métodos para deducir si una variable o expresión numérica es par.";
    cout<<"\n\nIngresa un numero: ";
    cin>>num;

    if(num%2==0){
        cout<<"El numero: "<<num<<" es par";
    }else{
        cout<<"El numero: "<<num<<" es impar";
    }
    cout<<"\n\n";
}