/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 32.-Escribir un programa que seleccione la operación aritmética a ejecutar entre dos números dependiendo del valor de una variable 
        denominada seleccionOp.

    Pagina 156
*/
#include<iostream>
using namespace std;
int main(){
    int selectionOpc=0, num1=0, num2=0;

    cout<<"Programa que ejecuta una operación aritmética entre dos números dependiendo de la opcion elegida\n";
    cout<<"\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division\n\nElija Opcion: ";
    cin>>selectionOpc;

    cout<<"\nIngrese el primer numero: ";
    cin>>num1;
    cout<<"Ingrese el segundo numero: ";
    cin>>num2;

    cout<<"\n";
    switch(selectionOpc){
        case 1:
                cout<<"Suma:\n "<<num1<<" + "<<num2<<" = "<<num1+num2;
            break;
        case 2:
            cout<<"Resta:\n "<<num1<<" - "<<num2<<" = "<<num1-num2;
            break;
        case 3:
            cout<<"Multiplicacion:\n "<<num1<<" * "<<num2<<" = "<<num1*num2;
            break;    
        case 4:
            cout<<"Division:\n "<<num1<<" + "<<num2<<" = "<<num1/num2;
            break;
        default:
            cout<<"La operacion no existe";
            break;        
    }//end switch

    cout<<"\n";
}