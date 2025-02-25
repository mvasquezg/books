/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 15.-Leer dos numeros y deducir si estan en orden creciente. 
    Actividades de programacion Rsueltas
    4.1, Pagina 151
*/
#include<iostream>
using namespace std;
int main(){
    int num1=0, num2=0;

    cout<<"Programa que lee dos numeros y deducir si estan en orden creciente.";
    cout<<"\n\nIngrese el primer numero: ";
    cin>>num1;
    cout<<"Ingrese el segundo numero: ";
    cin>>num2;

    if(num1<num2){
        cout<<"Los numeros estan en forma ascendente: "<<num1<<", "<<num2;
    }else if(num1==num2){
        cout<<"\nLos numeros son iguales: "<<num1<<" "<<num2;
    }else{
        cout<<"Los numeros estan en forma ascendente: "<<num2<<", "<<num1;
    }
    cout<<"\n\n";
}