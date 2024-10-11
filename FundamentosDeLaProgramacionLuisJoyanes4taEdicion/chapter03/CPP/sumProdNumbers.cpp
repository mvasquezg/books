    /*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 17.-Calcular y visualizar la suma y el producto de los numeros pares comprendidos entre 20 y 400, ambos incluidos.
*/
#include<limits.h>
#include<iostream>
using namespace std;

int main(){
    int sum=0;
    long long int prod=1;

    cout<<"Programa que calcula y visualiza la suma y el producto de los numeros pares comprendidos entre 20 y 70, ambos incluidos.";

    for(int i=20; i<=70; i+=2){
        sum+=i;
        prod*=i;    
    }   
    cout<<"\n\nSuma: "<<sum<<"\n\nProducto: "<<prod<<"\n\n";
}