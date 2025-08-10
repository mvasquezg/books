/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 11.-Se conoce la población de cada una de las veinticinco ciudades más grandes de las ocho provincias de Andalucía y
                 se desea identificar y visualizar la población de la ciudad más grande de cada provincia.
                
                 El problema consistirá, en primer lugar, en la obtención de la población mayor de cada provincia y realizar esta
                operación ocho veces, una para cada provincia.
                
                1. Encontrar y visualizar la ciudad mayor de una provincia.
                2. Repetir el paso 1 para cada una de las ocho provincias andaluzas.
    Pagina 181-182
*/
#include<iostream>
using namespace std;
int main(){
    int pob=0, mayorCity=0, mayorTown=0;
  
    for(int i=1; i<=8; i++){
        cout<<"\nCiudad "<<i<<":\n";
        for(int j=1; j<=25; j++){

            cout<<"Ingrese la cantidad de poblacion de la provincia "<<j<<": ";
            cin>>pob;

            if(pob>mayorTown){
                mayorTown=pob;
                mayorCity=j;
            }
        }//end for j

        cout<<"\nEn la ciudad "<<i<<", la provincia "<<mayorCity<<" es la mayor con un poblacion de "<<mayorTown<<" habitantes\n";
        mayorCity=0;
        mayorTown=0;    
    }//end for i
    cout<<"\n\n"; 
}