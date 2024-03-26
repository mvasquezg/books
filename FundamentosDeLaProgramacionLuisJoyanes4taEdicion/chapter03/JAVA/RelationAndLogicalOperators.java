/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 11.-Programa que muestre el resultado de las siguientes expresiones mezclando los operadores logicos y relacionales: 
					
				(1 < 5) Y ( 5 < 10) 
				(5 > 10) O (‘A’ < ‘B’)
*/
public class RelationAndLogicalOperators{
    public static void main(String[] args){
        
        if((6<5) && (5<10)){
            System.out.print("(6<5) Y (5<10) = Verdadero\n\n");
        }else{
            System.out.print("(6<5) Y (5<10) = Falso\n\n");
        }

        if((5 > 10) || ('C' < 'B')){
            System.out.print("(5 > 10) O (C < B) = Verdadero\n\n");
        }else{
            System.out.print("(5 > 10) O (C < B) = Falso\n\n");
        }
    }
}