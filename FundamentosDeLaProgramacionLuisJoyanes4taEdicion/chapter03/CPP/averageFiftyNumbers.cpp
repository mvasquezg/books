/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 23.-Calcular la media de 50 numeros e imprimir el resultado
*/
#include<iostream>
using namespace std;

//constante
#define maxValue 10

int main(){
    int number=0, sum=0;
    float average=0;

    for(int i=1; i<=maxValue; i++){
        cout<<i<<".-Ingresa un numero: ";
        cin>>number;
        sum+=number;
    }

    average=sum/maxValue;

    cout<<"Suma: "<<sum<<"\nPromedio: "<<average<<"\n";
}