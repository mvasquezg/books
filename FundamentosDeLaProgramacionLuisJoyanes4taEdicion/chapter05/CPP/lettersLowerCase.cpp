/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 05.-imprimir letras minúsculas del alfabeto
    Pagina 168
*/
#include<iostream>
using namespace std;
int main(){
    char letter='a';

    cout<<"Alfabeto en minuscula: \n\n";
    do{
        cout<<letter<<" ";
        letter++;
    }while(letter<='z');
    cout<<"\n";
}
