
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 22.-Si x es mayor que y, y z es menor que 20, leer un valor para p

    Ejercicios
    4.1 (d) Pagina 155
*/
#include<iostream>
using namespace std;

int main(){
    int x=0, y=0, z=0, p=0;
    
    cout<<"Programa que lee el valor de P si X es mayor que Y, y Z es menor que 20.\n";
    cout<<"\nIngresa el valor x: ";
    cin>>x;
    cout<<"Ingresa el valor y: ";
    cin>>y;
    cout<<"Ingresa el valor z: ";
    cin>>z;    
    
        
    if( (x>y) && (z<20)){
        cout<<"Ingresa el valor p: ";
        cin>>p;
    }else{
        cout<<"\nNo se cumple la condicion X>Y && z<20";
    }
    cout<<"\n\nLos valores son: X="<<x<<", Y="<<y<<", Z="<<z<<", P="<<p<<"\n\n";
}