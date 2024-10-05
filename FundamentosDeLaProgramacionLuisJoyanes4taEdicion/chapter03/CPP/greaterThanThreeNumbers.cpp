/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 13.-Determinar el mayor de tres numeros.
*/
#include<iostream>
using namespace std;

int main(){
    int num1=0, num2=0, num3=0;

    cout<<"Ingresa el primer numero: ";
    cin>>num1;

    cout<<"Ingresa el segundo numero: ";
    cin>>num2;

    cout<<"Ingresa el tercer numero: ";
    cin>>num3;

    if(num1==num2){

        if(num2==num3){
            cout<<"Los tres numeros son iguales.";
        }else if(num2>num3){
            cout<<num1<<" y "<<num2<<" son iguales y mayores";
        }else{
            cout<<num3<<" es mayor";
        }
    }else if(num1>num2){
        if(num2==num3){
            cout<<num1<<" es mayor";
        }else if(num2>num3){
            cout<<num1<<" es mayor";
        }else{
            if(num1==num3){
                cout<<num1<<" y "<<num3<<" son iguales y mayores";
            }else if(num1>num3){
                cout<<num1<<"%d es mayor";
            }else{
                cout<<num3<<" es mayor";
            }
        }

    }else{
        if(num2==num3){
            cout<<num2<<" y "<<num3<<" son iguales y mayores";
        }else if(num2>num3){
            cout<<num2<<" es mayor";
        }else{
            cout<<num3<<" es mayor";
        }
    }

    cout<<"\n\n";
}