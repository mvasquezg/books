/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 10: Programa que calcula el siguiiente polinomio 
                3x^5 - 5x^3 +2x -7
*/
package polynomial;

import polynomial.view.frame.PolynomialFrame;

import javax.swing.JFrame;

public class PolynomialApp{
    public static void main(String[] args){
        PolynomialFrame polyFrame=new PolynomialFrame();

        polyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}