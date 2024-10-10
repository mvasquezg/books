    /*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 15.-Elabora un programa que permita leer una serie de numeros distintos de cero (el ultimo numero de la serie es -99) y obtener el numero mayor. Como resultado se debe visualizar el numero mayor y un mensaje de indicacion de numero negativo, caso que se haya leido un numero negativo
*/
#include<iostream>
using namespace std;

int main(){
    int largestNumber=0, number=0;
    cout<<"Programa que determina el numero mayor de una serie de numeros.\n\nPresione -99 para salir.\n\n";
    do{
        cout<<"Ingresa un numero: ";
        cin>>number;

        if(number>largestNumber){
            largestNumber=number;
        }

        if(number<0 && number!=-99){
            cout<<number<<" numero negativo.\n";
        }

    }while(number!=-99);

    if(largestNumber!=0){
        cout<<"El numero mayor de la serie es: "<<largestNumber<<"\n";
    }   
}