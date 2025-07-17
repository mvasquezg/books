/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 31.-El sistema de calificación americano (de Estados Unidos) se suele calcular de acuerdo al siguiente cuadro:

                 Grado numérico                                                        Grado en letra
                 Grado mayor o igual a 90                                                A
                 Menor de 90 pero mayor o igual a 80                                         B   
                 Menor de 80 pero mayor o igual a 70                                         C
                 Menor de 70 pero mayor o igual a 69                                         D
                 Menor de 69                                                                 F

                Utilizando esta información, escribir un algoritmo que acepte una calificación numérica del estudiante (0-100),
                convierta esta calificación a su equivalente en letra y visualice la calificación correspondiente en letra.

    Pagina 155-156
*/
#include<iostream>
using namespace std;
int main(){
    int cal=0;
    cout<<"Programa que acepte una calificación numérica del estudiante (0-100), convierta esta calificación a su equivalente en letra y visualice la calificación correspondiente en letra.";
    cout<<"\nDe acuerdo a la siguiente tabla: ";
    cout<<"\n\nGrado numérico\t\t\t\tGrado en letra";
    cout<<"\nGrado mayor o igual a 90\t\t\tA";
    cout<<"\nMenor de 90 pero mayor o igual a 80\t\tB";   
    cout<<"\nMenor de 80 pero mayor o igual a 70\t\tC";
    cout<<"\nMenor de 70 pero mayor o igual a 69\t\tD";
    cout<<"\nMenor de 69\t\t\t\t\tF";

    cout<<"\n\nIngresa la calificacion numerica: ";
    cin>>cal;

    if(cal>=90){
        cout<<"La calificacion "<<cal<<" es igual a: A";
    }else if(cal>=80 && cal<90){
        cout<<"La calificacion "<<cal<<" es igual a: B";
    }else if(cal>=70 && cal<80){
        cout<<"La calificacion "<<cal<<" es igual a: C";
    }else if(cal==69){
        cout<<"La calificacion "<<cal<<" es igual a: D";
    }else{
        cout<<"La calificacion "<<cal<<" es igual a: F";
    }
    cout<<"\n";
}