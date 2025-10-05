/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 03.-Definición de la función: y = x^n (potencia n de x)
    
    Ejemplo3
    Pagina 206
*/
#include<iostream>
using namespace std;

//Funcion calculateY
void calculateY(int x, int n){
    int result=1;

    for(int i=1; i<=n; i++){
        result*=x;
    }

    cout<<"El resultado de la funcion Y=x^n es igual a:\nx="<<x<<"\nn="<<n<<"\n\nY="<<result<<"\n";
}


int main(){
    int x=0, n=0;
    cout<<"Program que calcula la funcion de Y=x^n.\nIngresa el valor x: ";
    cin>>x;

    cout<<"Ingresa el valor de n: ";
    cin>>n;

    cout<<"\n\n************";
    cout<<"\nLLamando a la funcion calculateY()\n";
    calculateY(x, n);
    
}