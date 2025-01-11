/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 04.-Empleo de estructura selectiva para detectar si un numero tiene o no parte fraccionaria.
    ejemplo 4.6, pagina 136
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class ValidateDecimalNumber{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        DecimalFormat number=new DecimalFormat("#.##");
        String strNumber="";
        float num=0;
        int dot=0, countDecimal=0, otherDecimal=0;

        System.out.print("\nPrograma que emplea de estructura selectiva para detectar si un numero tiene o no parte fraccionaria.");

        //Se pide un numero por pantalla y se guara en la varible tipo float
        System.out.print("\n\nIngresa un numero con decimales: ");
        num=in.nextFloat();

        //Se da formato en string al numero recibido por pantalla
        strNumber=String.format("%.2f", num);
        
        //Con este for se ubica la posicion del punto decimal
        for(int i=0; i<strNumber.length(); i++){
            if(strNumber.charAt(i)=='.'){
                dot=i;
            }
        }   

        //Con este for se hace el recorrido y se compara cada poscion para saber si hay un numero difente de cero
        for(int i=(dot+1); i<strNumber.length(); i++){
            if(strNumber.charAt(i)=='0'){
                countDecimal++;
            }else{
                otherDecimal++;
            }
        }

        //si el contador decimal es diferente de cero enr
        if(otherDecimal!=0){
            System.out.print(num+" Tiene parte fraccionaria\n\n");
        }else{
            System.out.print(num+" No tiene parte fraccionaria\n");
        }   
  }
}   