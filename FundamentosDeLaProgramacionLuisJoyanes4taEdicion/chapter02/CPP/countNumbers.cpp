/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 21.Diseñar un algoritmo que lea y visualice una serie de números distintos de cero. 
    El algoritmo debe terminar con un valor cero que no se debe visualizar. 
    Visualizar el número de valores leídos.
*/
#include<iostream>
using namespace std;

int main(){
    int number=0;
    int countNumbers=0;

    do{
        cout<<"Ingresa un numero: ";
        cin>>number;

        if(number!=0){
            countNumbers++;
        }

    }while(number!=0);

    cout<<"El total de numeros capturados es: "<<countNumbers<<"\n\n";
}