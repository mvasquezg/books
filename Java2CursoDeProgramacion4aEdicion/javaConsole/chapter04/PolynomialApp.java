/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 04: Introducción a la Programacion Orientada a Objetos
*Programa 03: Polinomio ax3+bx+2+cx+d
*/

public class PolynomialApp{
    public static void main(String[] args){
        Polynomial pol=new Polynomial();
        double result;

        pol.Polynomial(1, -3.2, 0, 7);
        
        result=pol.getResult(1);
        System.out.println(result);

        result=pol.getResult(1.5);
        System.out.println(result);

    }
}