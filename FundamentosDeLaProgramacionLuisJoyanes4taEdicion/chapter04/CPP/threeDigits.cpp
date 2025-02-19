/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 12.-Algoritmo que nos indique si un numero entero leido de teclado tiene 1, 2, 3 o mas digitos. Considerar los negativos.
    ejemplo 4.14, Pagina 144
*/
#include<iostream>
using namespace std;
int main(){
    int number=0, option=0;

    cout<<"Programa que nos indica si un numero entero leido de teclado tiene 1, 2, 3 o mas digitos. Considera los negativos.\n\n";

    cout<<"Ingrese un numero: ";
    cin>>number;

    if((number>=0 && number<10) || (number>-10 && number<=0)){
        cout<<"El numero "<<number<<" tiene una cifra";
    }else if((number>=10 && number<100) || (number<=-10 && number>-100)){
        cout<<"El numero "<<number<<" tiene dos cifras";
    }else if((number>=100 && number<1000) || (number<=-100 && number>-1000)){
        cout<<"El numero "<<number<<" tiene tres cifras";
    }else{
        cout<<"El numero "<<number<<" tiene mas de tres cifras";
    }
    cout<<"\n\n";
}