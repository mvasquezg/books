/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 04.-Cuenta hasta 10
    Pagina 167
*/
#include<iostream>
using namespace std;
int main(){
    int num=1;

    cout<<"Programa que cuenta del 1-10 usando ciclo do-while: \n";
    do{
        cout<<num<<", ";
        num++;
    }while(num<=10);
    cout<<"\n";
}