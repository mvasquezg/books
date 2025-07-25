/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 01.-Leer por teclado un número que represente una cantidad de números que a su vez se leerán también por teclado.
                 Calcular la suma de todos esos números.
    Pagina 156
*/

#include<iostream>
using namespace std;
int main(){
    int totalNumbers=0;
    float num=0, sum=0;

    cout<<"Programa que lee por teclado un número que representa una cantidad de números que a su vez se leerán también por teclado.\n Calcular la suma de todos esos números.";
    cout<<"\nIngrese la cantidad de numeros a sumar:  ";
    cin>>totalNumbers;

    cout<<"\n";
    while(totalNumbers>0){
        cout<<"Ingresa un numero: ";
        cin>>num;

        sum+=num;
        totalNumbers--;
    }
    cout<<"\nEl total de la suma: "<<sum<<"\n";
}
