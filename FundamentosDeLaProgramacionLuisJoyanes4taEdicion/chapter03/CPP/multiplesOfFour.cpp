/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 24.-Calcular los N primeros multiplos de 4(inclusive), donde N es un valor introducido por el teclado.
*/
#include<iostream>
using namespace std;

int main(){
    int number=0;

    cout<<"Ingresa un numero, mayor i gual a 4: ";
    cin>>number;

    cout<<"\nLos multiplos de "<<number<<" son: \n";
    for(int i=4; i<=number; i++){
        if(i%4==0){
            cout<<i<<" ";
        }
    }
    cout<<"\n\n";
}