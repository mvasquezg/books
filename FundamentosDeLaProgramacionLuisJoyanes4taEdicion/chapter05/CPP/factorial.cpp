/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 06.-Desarrollar el algoritmo necesario para calcular el factorial de un número N que responda a la fórmula:
                N! = N * (N – 1) * (N – 2), ..., 3 * 2 * 1
    Pagina 169
*/
#include<iostream>
using namespace std;
int main(){
    int factorial=1, num=0;

    cout<<"Programa que calcula el factorial de un numero.\nIngresa un numero: ";
    cin>>num;

    cout<<"\nEl factorial de "<<num<<" es igual a: ";
    for(int i=num; i>0; i--){
        factorial*=i;
    }

    cout<<factorial<<"\n\n";
}