
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 25.-Dados tres números deducir cuál es el central.

    Ejercicios:
    4.3  página 155 
*/
#include<iostream>
using namespace std;
int main(){
    int num1=0, num2=0, num3=0;
    cout<<"Programa que dado tres números deducir cuál es el central.\n\n";
    cout<<"Ingresa el primer numero: ";
    cin>>num1;

    cout<<"Ingresa el segundo numero: ";
    cin>>num2;

    cout<<"Ingresa el tercer numero: ";
    cin>>num3;

    cout<<"\n";
    if(num1==num2 && num2==num3){
        cout<<"Todos los numeros son iguales";
    }
    cout<<"\n";
    if(num1>num2){  
        if(num2==num3){
            cout<<"No hay numero intermedio.";
        }else if(num2>num3){
            cout<<"Numero de enmedio es: "<<num2;
        }else{
            cout<<"Numero de enmedio es: "<<num3;
        }
    }else { 
        if(num1==num3){
            cout<<"No hay numero intermedio.";
        }else if(num1>num3){
            cout<<"Numero de enmedio es: "<<num1;
        }else{
            cout<<"Numero de enmedio es: "<<num2;
        }
    }
    cout<<"\n\n";
}