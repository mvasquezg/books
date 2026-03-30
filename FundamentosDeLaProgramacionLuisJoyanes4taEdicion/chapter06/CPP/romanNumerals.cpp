/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 08.-Algoritmo que transforma un número introducido por teclado en notación decimal a romana. El número será entero
                 y positivo y no excederá de 3.000. 
    
    Ejemplo 9
    Pagina 212-213
*/
#include<iostream>
using namespace std;

void convertToRomanNumeral(int digit, char v1, char v2, char v3){
    int j=0;

    if(digit==9){
        cout<<v1<<v3;
    }else if(digit>4){
            cout<<v2;

            for(int i=1; i<=digit-5; i++){
                cout<<v1;
            }
    }else if(digit==4){
            cout<<v1<<v2;
    }else{ 
            for(int i=1; i<=digit; i++){
                cout<<v1;
            }   
    }    
    
}


int main(){
    int num=0;
    int r=0, digit=0;

    cout<<"***** Programa que convierte un numero decimal a numero romano *****\n\n";

    do{
        cout<<"Ingresa un numero entre 1-3000: ";
        cin>>num;
    }while(num<=0 || num>3000); 
    
    //Millar
    r=num;
    digit=r/1000;
    r=r%1000;

    convertToRomanNumeral(digit, 'M', ' ', ' ');

    //Centena
    digit=r/100;
    r=r%100;

    convertToRomanNumeral(digit, 'C', 'D', 'M');

    //Decena
    digit=r/10;
    r=r%10;
    
    convertToRomanNumeral(digit, 'X', 'L', 'C');

    //Unidad
    digit=r;
    convertToRomanNumeral(digit, 'I', 'V', 'X');
    
    cout<<"\n\n";
}