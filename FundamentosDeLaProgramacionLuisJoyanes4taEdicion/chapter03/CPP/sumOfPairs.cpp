/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 21.-Sumar los numeros pares del 2 al 100 e imprimir su valor.
*/
#include<iostream>
using namespace std;

int main(){
    
    int sum=0;
    cout<<2;
    sum=2;
    for(int i=4; i<=100; i+=2){
        cout<<", "<<i;
        sum+=i;
    }
    cout<<"\nSuma Total: "<<sum<<"\n";
}