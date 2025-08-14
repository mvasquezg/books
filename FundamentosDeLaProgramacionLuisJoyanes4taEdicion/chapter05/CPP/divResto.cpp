/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 16.-Dados dos números enteros, realizar el algoritmo que calcule su cociente y su resto.
    
    Ejercicio 5.5
    Pagina 187
*/
#include<iostream>
using namespace std;

int main(){
    int num1=0, num2=0, dividendo=0, divisor=0, cociente=0;

    cout<<"Ingresa el dividendo: ";
    cin>>num2;

    cout<<"Ingresa el divisor: ";
    cin>>num1;

    divisor=num1;
    dividendo=num2;   

    do{
        dividendo=dividendo-divisor;
        cociente++;
    }while(dividendo>=divisor);

    cout<<"\nLa division de "<<num2<<" / "<<num1<<"\nCociente: "<<cociente<<" \nResto: "<<dividendo<<"\n\n";

}