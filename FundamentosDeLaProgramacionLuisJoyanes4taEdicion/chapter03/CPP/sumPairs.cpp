/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 28.-Escribir la suma de los primeros diez numeros pares.
*/
#include<iostream>
using namespace std;

int main(){
    int sum=0;

    cout<<"\n2";
    sum=2;
    for(int i=2; i<=10; i++){
        sum+=i*2;
        cout<<" + "<<(i*2);
    }

    cout<<" = "<<sum<<"\n\n";

}