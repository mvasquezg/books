/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 24.-Escribir un programa que solicite al usuario introducir dos números. Si el primer número introducido es mayor que el segundo número, 
    el programa debe imprimir el mensaje El primer número es el mayor, en caso contrario el programa debe imprimir el mensaje El primer número es el más 
    pequeño. Considerar el caso de que ambos números sean iguales e imprimir el correspondiente mensaje.
    
    Pagina 155
*/
#include<iostream>
using namespace std;
int main(){
    int num1=0, num2=0;

    cout<<"Programa que solicita al usuario introducir dos números. Si el primer número introducido es mayor que el segundo número,"; 
    cout<<" el programa debe imprimir el mensaje\nEl primer número es el mayor, en caso contrario el programa debe imprimir el mensaje ";
    cout<<"El primer número es el más pequeño. Considerar el caso de que ambos números sean iguales\ne imprimir el correspondiente mensaje.\n\n";

    cout<<"Ingresa el primer numero: ";
    cin>>num1;

    cout<<"Ingresa el segundo numero: ";
    cin>>num2;

    cout<<"\n";
    if(num1==num2){
        cout<<"El numero 1 y el numero 2 son iguales.";
    }else if(num1>num2){
        cout<<"El primer numero es el mayor";
    }else{
        cout<<"El primer numero es el mas pequeño";
    }
    cout<<"\n\n";
}

