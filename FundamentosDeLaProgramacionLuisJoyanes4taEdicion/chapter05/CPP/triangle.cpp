/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 14.-Escribir un programa que visualice un triángulo isósceles.
    Pagina 188-185
*/
#include<iostream>
using namespace std;
int main(){
    int num=5;
    char whiteCharacter=' ';
    char asterisco='*';

    for(int i=1; i<=num; i++){

        for(int j=num; j>0; j--){
           cout<< whiteCharacter;
        }

        for(int k=1; k<(2*i); k++){
           cout<< asterisco;
        }
        cout<<"\n";
    }
    cout<<"\n\n";
}