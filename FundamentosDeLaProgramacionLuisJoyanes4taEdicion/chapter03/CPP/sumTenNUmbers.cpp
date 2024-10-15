/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 22.-Sumar 10 numeros introducidos por el teclado,
*/
#include<iostream>
using namespace std;

int main(){
    
    int sum=0, number=0;
    
    for(int i=1; i<=10; i++){
        cout<<i<<".-Ingres un numero: ";
        cin>>number;
        sum+=number;
    }
    cout<<"\nSuma Total: "<<sum<<"\n";
}