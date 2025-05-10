/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 19.-Si un ángulo es igual a 90 grados, imprimir el mensaje "El ángulo es un ángulo recto" sino imprimir el mensaje 
    "El ángulo no es un ángulo recto.

    Ejercicios
    4.1 (a) Pagina 155
*/
#include<iostream>
using namespace std;

int main(){
    float angle=0;

    cout<<"Programa que determina si un angulo es Recto o no.\nIngrese el valor del angulo: ";
    cin>>angle;

    cout<<"\n";
    if(angle!=90){
        cout<<"El angulo "<<angle<<" no es recto";
    }else{
        cout<<"El angulo "<<angle<<" es recto";
    }
    cout<<"\n";
}
