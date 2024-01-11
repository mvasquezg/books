/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 19. Dividir dos numeros enteros.
*/
#include<iostream>
using namespace std;
int main(){
    int number1=0;
    int number2=0;
    int division=0;

    cout<<"Ingrese un numero: ";
    cin>>number1;

    cout<<"Ingrese otro numero: ";
    cin>>number2;

    if(number1!=0 && number2!=0){
        division=number1/number2;
        cout<<"La division es igual a: "<<division<<"\n\n";
    }else{
        cout<<"No se pueden didivir ceros\n\n";
    }
}