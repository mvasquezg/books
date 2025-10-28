/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 04.-Diseñar un algoritmo que contenga un subprograma de cálculo del factorial de un número y una llamada al
                mismo.
    
    Ejemplo4
    Pagina 207
*/
#include<iostream>
using namespace std;

int showFactorial(int x){
    if(x<=1){
        return 1;
    }else{
        return x*showFactorial(x-1);
    }
    
}

int main(){
    int x=0;
    cout<<"Programa que calcula un factorial:\nIngrese un numero: ";
    cin>>x;

    cout<<"\nResultado del factorial:\n"<<x<<"! = "<<showFactorial(x)<<"\n\n";
}