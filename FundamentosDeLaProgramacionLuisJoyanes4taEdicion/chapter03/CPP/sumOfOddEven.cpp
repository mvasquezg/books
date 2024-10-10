    /*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 15.-Se desea calcular la suma de los numeros pares e impares comprendidos entre 1 y 200
*/

#include<iostream>
using namespace std;

int main(){
    int sumEven=0, sumOdd=0;

    for(int i=1; i<=200; i++){

        if(i%2==0){
            sumEven+=i;
        }else{
            sumOdd+=i;
        }
    }

    cout<<"la suma de los numeros pares es igual a: "<<sumEven<<"\nla suma de los numeros impares es igual a: "<<sumOdd<<"\n\n";
}