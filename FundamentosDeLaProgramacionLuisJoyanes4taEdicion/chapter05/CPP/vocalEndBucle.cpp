/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control I: Estructuras Selectivas
    Problema 16.-Escribir una frase y detenerse en la primera vocal leída. (Se supone que se leen, uno a uno, caracteres desde el teclado.)
    Pagina 188

*/
#include<iostream>
using namespace std;
int main(){
    char letter='0';

    cout<<"El programa termina al leer una vocal\n\n";
    do{
        cout<<"Ingresa un letra: ";
        cin>>letter;
        
    }while(letter!='a' && letter!='e' && letter!='i' && letter!='o' && letter!='u');

    cout<<"\n\nLa vocal que termino el ciclo es: "<<letter<<"\n\n";
}