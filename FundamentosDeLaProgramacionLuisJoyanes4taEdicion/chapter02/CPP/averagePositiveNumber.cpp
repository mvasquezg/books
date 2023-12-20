/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 09.Calcular el promedio de una serie de números positivos. 
    Un valor de cero indicará que se ha alcanzado el final de la serie de números positivos
*/

#include<iostream>
using namespace std;

int main(){
    int number=0;
    int average=0;
    int count=0;
    int sum=0;

    cout<<"Ingresa un numero: ";
    cin>>number;
    
    while(number>0 || number<0){

        if(number>0){
            sum+=number;
            count++;
        }

        cout<<"Ingresa un numero: ";
        cin>>number;
    }
    
    average=sum/count;

    cout<<"\n\nSuma: "<<sum<<"\nNumeros positvos ingresados: "<<count<<"\nPromedio: "<<average<<"\n\n";
}