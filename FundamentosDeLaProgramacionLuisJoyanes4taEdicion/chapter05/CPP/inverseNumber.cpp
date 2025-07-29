/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 03.-Obtener un algoritmo que lea un número (por ejemplo, 198) y obtenga el número inverso (por ejemplo, 891).
    Pagina 166
*/
#include<iostream>
using namespace std;
int main(){
    int num=0, inverseNumber=0;

    cout<<"Programa que lee un número (por ejemplo, 198) y obtenga el número inverso (por ejemplo, 891).\n\nIngresa un numero: ";
    cin>>num;

    cout<<"\nNumero Inverso: ";
    do{
        inverseNumber=num%10;
        cout<<inverseNumber;
        num=num/10;
    }while(num>0);
    cout<<"\n";
}