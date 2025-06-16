/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 26.-Calcular la raíz cuadrada de un número y escribir su resultado. Considerando el caso en que el número sea negativo.

    Ejercicios:
    4.4  página 155 
*/
#include<iostream>
#include<math.h>
using namespace std;

int main(){
    float num=0;
    cout<<"programa que calcula la raíz cuadrada de un número y escribir su resultado. Considerando el caso en que el número sea negativo.";
    cout<<"\n\nIngresa un numero: ";
    cin>>num;

    cout<<"\n";
    if(num<=0){
        cout<<"El numero ingresado no tiene raiz cuadrada.";
    }else{
        cout<<"La raiz cuadrada de "<<num<<" es igual a: "<<sqrt(num);
    }

    cout<<"\n\n";
}