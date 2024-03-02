/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 01.-Mostra funcionamiento operadores de incremento.
*/  
#include<iostream>
using namespace std;

int main(){
    int n=5;
    
    cout<<"Valor inicial de n: "<<n;
    cout<<"\nEscribir el valor de la n cuando se ejecuta: n++: "<<n++;
    cout<<"\nImprimir el valor de n cuando ya se ejecuto n++: "<<n;

    n=5;
    cout<<"\n\nAsignando valor inicial de n, nuevamente: "<<n;
    cout<<"\nEscribir el valor de la n cuando se ejecuta: ++n: "<<++n;
    cout<<"\nImprimir el valor de n cuando ya se ejecuto ++n: "<<n<<"\n\n";
}
