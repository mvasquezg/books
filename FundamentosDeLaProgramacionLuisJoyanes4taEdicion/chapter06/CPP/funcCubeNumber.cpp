/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 05.-Realizar el diseño de la función y = x3 (cálculo del cubo de un número)..
    
    Ejemplo5
    Pagina 207
*/
#include<iostream>
using namespace std;

int calculateCube(int x){
    return x*x*x;
}

int main(){
    int num=0;
    cout<<"programa que calcula el cubo de un numero\nIngresa un numero: ";
    cin>>num;

    cout<<"El cubo de "<<num<<" es igual a: "<<calculateCube(num)<<"\n\n";
}