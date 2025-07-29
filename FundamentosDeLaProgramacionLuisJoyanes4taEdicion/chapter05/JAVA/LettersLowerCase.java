/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 05.-imprimir letras minúsculas del alfabeto
    Pagina 168
*/

public class LettersLowerCase{
    public static void main(String[] args){
        char letter='a';

        System.out.print("Alfabeto en minuscula: \n\n");
        do{
            System.out.print(letter+" ");
            letter++;
        }while(letter<='z');
        System.out.print("\n");
    }
}