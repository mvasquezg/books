/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 18.-Construir un algoritmo que escriba los nombres de los días de la semana, en función de la entrada correspondiente
a la variable DIA.
        1. LUNES
        2. MARTES
        3. MIERCOLES
        4. JUEVES
        5. VIERNES
        6. SABADO
        7. DOMINGO
    
        Actividades de programacion Resueltas
        4.4, Pagina 152-153

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
            cout<<"Dia "<<day<<" es: Lunes";
            break;
        case 2:
            cout<<"Dia "<<day<<" es: Martes";
            break; 
        case 3:
            cout<<"Dia "<<day<<" es: Miercoles";
            break;
        case 4:
            cout<<"Dia "<<day<<" es: Jueves";
            break;
        case 5:
            cout<<"Dia "<<day<<" es: Viernes";
            break;
        case 6:
            cout<<"Dia "<<day<<" es: Sabado";
            break;
        case 7:
            cout<<"Dia "<<day<<" es: Domingo";
            break;
        default:
            cout<<"El valor ingresado no pertenece a algun dia de la semana.";
            break;                            
    }
    cout<<"\n\n";
}   