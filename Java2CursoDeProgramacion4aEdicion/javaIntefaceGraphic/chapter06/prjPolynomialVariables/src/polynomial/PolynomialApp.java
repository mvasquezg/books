/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 11: Programa que calcula el siguiiente polinomio 
                ax^5 - bx^3 + cx - d
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