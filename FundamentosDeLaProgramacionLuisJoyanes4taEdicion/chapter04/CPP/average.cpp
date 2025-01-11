/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 03.-Calcula la media aritmetica de un seria de numeros positivos. La media arimetica  de n numeros es:
			x1+x2+x3+ ...+xn
				n
                En el problema se supondra un entrada de datos por el teclado hasta que se introduzca el ultimo numero, en nuestro caso -99. para calcular la media aritmetica se necesita saber cuantos numeros se han introducido hasta llegar a -99.		
    ejemplo 4.4, pagina 133
*/
#include<iostream>
using namespace std;

int main(){
    int num=0, sum=0, countPositves=0;
    float average=0;

    cout<<"\nPrograma que calcula la media aritmetica de una serie de nuemros positivos. Presione -99 para salir.\n";


    do{
        cout<<"Ingrese un numero: ";
        cin>>num;
        if(num>0){
            sum+=num;
            countPositves++;
        }
    }while(num!=-99);

    average=sum/countPositves;
    cout<<"\n\nLa suma de la serie de los numeros positivos es igual a: "<<sum;
    cout<<"\nCantidad de numeros positivos: "<<countPositves<<"\n\n";
    cout<<"\nEl promedio es igual a: "<<average<<"\n\n";

}
