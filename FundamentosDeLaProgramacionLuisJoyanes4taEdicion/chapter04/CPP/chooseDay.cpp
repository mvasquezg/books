/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 10.-Leida una fecha, decir el dia de la semana, suponiendo que el dia 1 de dicho mes fue lunes.
    ejemplo 4.12, Pagina 142
*/
#include<iostream>
using namespace std;
int main(){
   int day=0, month=0, year=0, d=0;
    cout<<"\nLeida una fecha, decir el dia de la semana, suponiendo que el dia 1 de dicho mes fue lunes.\nConsidere que todos los meses tengan 31 dias\n";
    cout<<"\nIngrese la fecha\nDia: ";
    cin>>day;
    cout<<"Mes: ";
    cin>>month;
    cout<<"Ingrese anho: ";
    cin>>year;
    d=day%7;
    cout<<"\n";
    switch(d){
        case 1:
            cout<<"La fecha "<<day<<"-"<<month<<"-"<<year<<", el dia fue: Lunes";
            break;
        case 2:
            cout<<"La fecha "<<day<<"-"<<month<<"-"<<year<<", el dia fue: Martes";
            break;
        case 3:
            cout<<"La fecha "<<day<<"-"<<month<<"-"<<year<<", el dia fue: Miercoles";
            break;
        case 4:
            cout<<"La fecha "<<day<<"-"<<month<<"-"<<year<<", el dia fue: Jueves";
            break;        
        case 5:
            cout<<"La fecha "<<day<<"-"<<month<<"-"<<year<<", el dia fue: Viernes";
            break;
        case 6:
            cout<<"La fecha "<<day<<"-"<<month<<"-"<<year<<", el dia fue: Sabado";
            break;
        case 0:
            cout<<"La fecha "<<day<<"-"<<month<<"-"<<year<<", el dia fue: Domingo";
            break;            
    }
    cout<<"\n\n";
}