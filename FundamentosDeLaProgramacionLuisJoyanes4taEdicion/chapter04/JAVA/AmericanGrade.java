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
import java.util.Scanner;
class AmericanGrade{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int cal=0;
        System.out.print("Programa que acepte una calificación numérica del estudiante (0-100), convierta esta calificación a su equivalente en letra y visualice la calificación correspondiente en letra.");
        System.out.print("\nDe acuerdo a la siguiente tabla: ");
        System.out.print("\n\nGrado numérico\t\t\t\tGrado en letra");
        System.out.print("\nGrado mayor o igual a 90\t\t\tA");
        System.out.print("\nMenor de 90 pero mayor o igual a 80\t\tB");   
        System.out.print("\nMenor de 80 pero mayor o igual a 70\t\tC");
        System.out.print("\nMenor de 70 pero mayor o igual a 69\t\tD");
        System.out.print("\nMenor de 69\t\t\t\t\tF");
    
        System.out.print("\n\nIngresa la calificacion numerica: ");
        cal=in.nextInt();
    
        if(cal>=90){
            System.out.print("La calificacion "+cal+" es igual a: A");
        }else if(cal>=80 && cal<90){
            System.out.print("La calificacion "+cal+" es igual a: B");
        }else if(cal>=70 && cal<80){
            System.out.print("La calificacion "+cal+" es igual a: C");
        }else if(cal==69){
            System.out.print("La calificacion "+cal+" es igual a: D");
        }else{
            System.out.print("La calificacion "+cal+" es igual a: F");
        }
        System.out.print("\n");
    }
}    