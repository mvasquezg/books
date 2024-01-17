/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 022.-Diseñar un algoritmo que visualice y sume la serie de números
        		  3, 6, 9, 12..., 99
*/
#include<iostream>
using namespace std;

int main(){
    
    for(int i=3; i<=100; i+=3){
        cout<<i<<", ";
    }

    cout<<"\n";
    
    return 0;
}