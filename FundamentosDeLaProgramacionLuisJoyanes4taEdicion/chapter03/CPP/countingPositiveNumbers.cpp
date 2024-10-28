/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
  Capitulo 03.-Estructura general de un programa.
  Problema 18.-Leer 500 numeros enteros y obtener cuantos son positivos.
*/

#include<iostream>
using namespace std;
int main(){
    int countPositive=0, num=0, maxValue=15;

    cout<<"Leer 500 numeros enteros y obtener cuantos son positivos.\n\n";

    for(int i=1; i<=maxValue; i++){
        cout<<i<<".-Ingresa un numero: ";
        cin>>num;

        if(num>0){
            countPositive++;
        }
    }
    cout<<"\nDe "<<maxValue<<" valores, hay "<<countPositive<<" numeros positivos\n\n";
}   