/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 06.-Algoritmo que simplifique un quebrado, dividiendo numerador y denominador por su máximo común divisor.
    
    Ejemplo 7
    Pagina 208-209
*/
#include<iostream>
using namespace std;

int showMcd(int numerator, int denominator){
    int dividendo=0, divisor=0;

    if(numerator%denominator==0){
        return denominator;
    }else{
        dividendo=denominator;
        divisor=numerator%denominator;
        return showMcd(dividendo, divisor);
    }   
    
}


int main(){

    int numerator=0, denominator=0, mcd=0;
    
    cout<<"Ingresa el numerador: ";
    cin>>numerator;

    cout<<"Ingresa el denominador: ";
    cin>>denominator;

    mcd=showMcd(numerator, denominator);
    
    cout<<"\nFraccion: "<<numerator<<" / "<<denominator<<"\nMCD: "<<mcd<<"\n";

    cout<<"\nFraccion simplificada: "<<(numerator/mcd)<<" / "<<(denominator/mcd)<<"\n";

    
}

