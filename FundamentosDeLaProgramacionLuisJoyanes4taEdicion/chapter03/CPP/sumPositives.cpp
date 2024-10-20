/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 29.-Escribir un algoritmo que lea los datos de entrada de un archivo que solo contien numeros y sume los numeros positivos.
*/

#include<iostream>
using namespace std;
int main(){
    int sum=0, num=0;
    cout<<"Programa que calcula la suma de los numeros positivos, presione -99 para salir:\n";
    do{
        cout<<"\nIngrese un numero: ";
        cin>>num;

        if(num>0){
            sum+=num;
        }

    }while(num!=-99);

    cout<<"La suma de todos o numeros positivos es: "<<sum<<"\n\n";
}   