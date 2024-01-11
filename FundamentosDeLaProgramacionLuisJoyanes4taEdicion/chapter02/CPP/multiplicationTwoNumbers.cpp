/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 18. Multiplicar dos numeros enteros.
*/

#include<iostream>
using namespace std;
int main(){
    int number1=0;
    int number2=0;
    int multiplication=0;

    cout<<"Ingrese un numero: ";
    cin>>number1;

    cout<<"Ingrese otro numero: ";
    cin>>number2;

    multiplication=number1*number2;

    cout<<"La multiplicacion es igual a: "<<multiplication<<"\n\n";
}