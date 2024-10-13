/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 20.-Calcular la suma de los cuadrados de los cien primeros numeros naturales.
*/
#include<iostream>
using namespace std;

int main(){
    int sum=0;
    for(int i=1; i<=100; i++){
      cout<<i<<" * "<<i<<" = "<<(i*i)<<"\n";
        sum+=(i*i);
    }
    cout<<"Suma Total: "<<sum<<"\n";
}