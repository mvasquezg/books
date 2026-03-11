/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 07.-Supuesto que nuestro compilador tiene la funcion. Podriamos calcular el seno de x mediante la siguiente serie:

    sen(x)= x - (x^3/3!) + (x^5/5!) + (x^7/7!) + ...(hasta 17 terminos)   
    
    Ejemplo 8
    Pagina 208-209
*/
#include<iostream>
using namespace std;

double showFactorial(double x){
    if(x<=1){
        return 1;
    }else{
        return x*showFactorial(x-1);
    }   
}

double power(double base, double expo){
    double result=1;
    for(int i=1; i<=expo; i++ ){
        result*=base;
    }

    return result;
}

double sen(double x){
    double X, s;
    int n=0;

    X=x*3.141592/180;
    s=X;

    for(int i=2; i<=17; i++){
        n=2*i-1;

        if(i%2!=0){
            s=s-(power(X, n)/showFactorial(n));
        }else{
            s=s+(power(X, n)/showFactorial(n));
        }
    }
    return s;
}

int main(){
    double x=0, base=3;;
    cout<<"Ingrese el valor de grados: ";
    cin>>x;
    cout<<"\nsen(x) = "<<sen(x)<<"\n\n";
   
}
