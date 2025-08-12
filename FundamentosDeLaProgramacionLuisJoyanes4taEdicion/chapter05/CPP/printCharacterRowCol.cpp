/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 15.-Ejecutar y visualizar el programa siguiente que imprime una tabla de m filas por n columnas y un carácter
prefijado.
    Pagina 185
*/
#include<iostream>
using namespace std;
int main(){
    int row=0, column=0;
    char ch;

    cout<<"Ingrese la cantidad de filas: ";
    cin>>row;

    cout<<"Ingrese la cantidad de columnas: ";
    cin>>column;

    cout<<"Ingrese character: ";
    cin>>ch;

    cout<<"\n";
    for(int i=1; i<=row; i++){
        for(int j=1; j<=column; j++){
            cout<<ch;
        }
        cout<<"\n";
    }
    
}