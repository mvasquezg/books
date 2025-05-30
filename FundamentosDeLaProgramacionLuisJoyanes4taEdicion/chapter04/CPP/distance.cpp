
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 23.-Si distancia es mayor que 20 y menos que 35, leer un valor para tiempo.

    Ejercicios
    4.1 (e) Pagina 155
*/
#include<iostream>
using namespace std;

int main(){

    int distance=0, time=0;

    cout<<"programa Si distancia es mayor que 20 y menos que 35, leer un valor para tiempo: ";

    cout<<"\n\nIngresa la distancia: ";
   cin>>distance;

    if(distance>20 && distance<35){
        cout<<"ingresa el tiempo: ";
       cin>>time;
    }

    cout<<"\nLos valores son:\nDistancia = "<<distance<<"\nTiempo = "<<time<<"\n\n";

}