/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 07.-Se desea diseñar un algoritmo que escriba los nombres de los dias en función del valor de una variable
    DIA introducida por el teclado.
    Los días de la semana son 7: por consiguiente, el rango de los valores será 1 .. 7, y el caso que el día tome un valor 
    fuera de este rango se deberá producir un mensaje de error advirtiendo la situación anómala.  
    ejemplo 4.8, Pagina 138
*/
#include<iostream>
using namespace std;
int main(){
    int day=0;
    cout<<"Ingresa un numero del 1 al 7, para indicar el dia del semana\nIngresa un numero: ";
    cin>>day;
    cout<<"\n";
    switch(day){
        case 1:
            cout<<"Lunes";
            break;
        case 2:
            cout<<"Martes";
            break;
        case 3:
            cout<<"Miercoles";
            break;
        case 4:
            cout<<"Jueves";
            break;
        case 5:
            cout<<"Viernes";
            break;
        case 6:
            cout<<"Sabado";
            break;
        case 7:
            cout<<"Domingo";
            break;
        default:
            cout<<"El numero ingresado no pertenece a algun dia de la semana.";
            break;                            
    }
    cout<<"\n\n";
}   