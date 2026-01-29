/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 06.-Algoritmo que simplifique un quebrado, dividiendo numerador y denominador por su máximo común divisor.
    
    Ejemplo 7
    Pagina 208-209
*/

class SimplifyFraction{
    static int showMcd(int numerator, int denominator){
        int dividendo=0, divisor=0;

        if(numerator%denominator==0){
            return denominator;
        }else{
            dividendo=denominator;
            divisor=numerator%denominator;
            return showMcd(dividendo, divisor);
        }   
    }

    public static void Main(string[] args){
        int numerator=0, denominator=0, mcd=0;
    
        System.Console.Write("Ingresa el numerador: ");
        numerator=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa el denominador: ");
        denominator=int.Parse(System.Console.ReadLine());

        mcd=showMcd(numerator, denominator);

        System.Console.Write("\nFraccion: "+numerator+" / "+denominator+"\nMCD: "+mcd+"\n");

        System.Console.Write("\nFraccion simplificada: "+(numerator/mcd)+" / "+(denominator/mcd)+"\n");

    }

}