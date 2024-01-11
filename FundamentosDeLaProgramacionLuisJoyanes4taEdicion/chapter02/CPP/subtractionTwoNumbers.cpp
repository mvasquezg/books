/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 17. Restar dos numeros enteros.
*/

#include<iostream>
using namespace std;
int main(){
    int number1=0;
    int number2=0;
    int subtraction=0;

    cout<<"Ingrese un numero: ";
    cin>>number1;

    cout<<"Ingrese otro numero: ";
    cin>>number2;

    subtraction=number1-number2;

    cout<<"La diferencia es igual a: "<<subtraction<<"\n\n";
}