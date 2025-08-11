/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 12.-El segmento de programa siguiente visualiza una tabla de multiplicación por cálculo y visualización de productos
                 de la forma x * y para cada x en el rango de 1 a Xultimo y desde cada y en el rango 1 a Yultimo (donde Xultimo, e Yultimo son enteros prefijados). La tabla que se desea obtener es
    Pagina 183
*/
#include<iostream>
#include<iomanip>

using namespace std;
int main(){
    
    cout<<setw(15)<<" i "<<setw(6) << " j\n";
    
    for(int i=0; i<=4; i++){
        cout<<"Externo"<<setw(7)<<i<<"\n"; 
        for(int j=0; j<i; j++){
            cout<<setw(7)<<" Interno"<<setw(12)<<j<<"\n"; 
        }
            
    }
    cout<<"\n\n";
}