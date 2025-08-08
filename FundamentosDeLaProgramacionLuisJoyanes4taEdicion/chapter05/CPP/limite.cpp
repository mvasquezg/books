/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 06.-Encontrar el entero positivo más pequeño (num) para el cual la suma 1+2+3+...+num es menor o igual que límite.
                1. Introducir limite.
                2. Inicializar num y suma a 0.
                3. Repetir las acciones siguientes hasta que suma > limite
                    • incrementar num en 1,
                    • añadir num a suma.
                4. Visualizar num y suma.   
    Pagina 170
*/
#include<iostream>
using namespace std;
int main(){
    int num=0, sum=0, limite=0;

    cout<<"Ingresa el limite: ";
    cin>>limite;

    do{
        num+=1;
        sum+=num;
    }while(num>limite);

    cout<<"NUmero menor: "<<num<<"\nSuma: "<<sum<<"\n\n";

}