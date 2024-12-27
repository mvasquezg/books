/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 01.-Calcula la suma y el producto de dos numeros.
    ejemplo 4.1, pagina 129
*/
#include<iostream>
using namespace std;

int main(){
    int num1=0, num2=0, sum=0, product=0;

    cout<<"Programa que calcula la suma y el producto de dos numeros. \n\nIngrese el primer numero: ";
    cin>>num1;

    cout<<"Ingrese el segundo numero: ";
    cin>>num2;

    sum=num1+num2;
    product=num1*num2;

    cout<<"\nSuma:\n"<<num1<<" + "<<num2<<" = "<<sum<<"\n\n";
    cout<<"\nProducto:\n"<<num1<<" * "<<num2<<" = "<<product<<"\n\n";
}