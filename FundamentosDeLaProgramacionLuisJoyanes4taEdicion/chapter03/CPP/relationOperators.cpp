/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 07.-Programa que aplica operadores relacionales.

    < Menor que.
    > mayor que.
    == Igual que.
    <= menor o igual que
    >= mayor o igual que 
    != distinto que
*/
#include<iostream>
using namespace std;

int main(){
    int a=3, b=4;
    cout<<"Programa que muestra los operadores relacionales con los numeros A= "<<3<<", B="<<4<<"\n\n";
    
    if(a<b){
        cout<<a<<" < "<<b<<" = Verdadero\n";
    }else{
        cout<<a<<" < "<<b<<" = Falso\n";
    }

    if(a>b){
        cout<<a<<" > "<<b<<" = Verdadero\n";
    }else{
            cout<<a<<" > "<<b<<" = Falso\n";
    }

    if(a==b){
        cout<<a<<" == "<<b<<" = Verdadero\n";
    }else{
        cout<<a<<" == "<<b<<" = Falso\n";
    }

    if(a<=b){
        cout<<a<<" <= "<<b<<" = Verdadero\n";
    }else{
        cout<<a<<" <= "<<b<<" = Falso\n";
    }

    if(a>=b){
        cout<<a<<" >= "<<b<<" = Verdadero\n";
    }else{
        cout<<a<<" >= "<<b<<" = Falso\n";
    }

    if(a!=b){
        cout<<a<<" != "<<b<<" = Verdadero\n";
    }else{
        cout<<a<<" != "<<b<<" = Falso\n";
    }

    cout<<"\n\n";
    return 0;
}