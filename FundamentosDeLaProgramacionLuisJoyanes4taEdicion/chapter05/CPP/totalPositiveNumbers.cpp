/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 02.-Contar los números enteros positivos introducidos por teclado. Se consideran dos variables enteras numero 
                y contador (contará el número de enteros positivos). Se supone que se leen números positivos y se detiene 
                el bucle cuando se lee un número negativo o cero.
    Pagina 161
*/
#include<iostream>
using namespace std;
int main(){
    int num=0, totalNumbers=0;

    cout<<"Contar los números enteros positivos introducidos por teclado.\nSe supone que se leen números positivos y se detiene el bucle cuando se lee un número negativo o cero.";
    cout<<"\n\nIngrese un numero: ";
    cin>>num;

    while(num>0){
        totalNumbers++;
        cout<<"Ingrese un numero: ";
        cin>>num;
    }

    cout<<"\nTotal de numeros positivos ingresados: "<<totalNumbers<<"\n";
}