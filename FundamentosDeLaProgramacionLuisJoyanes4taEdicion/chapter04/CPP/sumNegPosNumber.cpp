
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 21.-Si el número es positivo, sumar el número a total de positivos, sino sumar al total de negativos.

    Ejercicios
    4.1 (c) Pagina 155
*/
#include<iostream>
using namespace std;
int main(){
    int num=0, sumPosit=0, sumNegat=0;
    char resp='0';
    
    cout<<"Programa que de un listado de numero evalua Si el número es positivo, sumar el número a total de positivos, sino sumar al total de negativos.\n\n";    
    
    do{
        cout<<"Ingresa un numero: ";
        cin>>num;
        
        if(num<0){
            sumNegat+=num;
        }else{
            sumPosit+=num;
        }

        cout<<"\nDesea agregar otro numero: ";
        cin>>resp;
        
    }while(resp!='n');
    
    cout<<"\nSuma de numeros positivos: "<<sumPosit<<"\nSuma de numeros negativos: "<<sumNegat<<"\n\n";
}