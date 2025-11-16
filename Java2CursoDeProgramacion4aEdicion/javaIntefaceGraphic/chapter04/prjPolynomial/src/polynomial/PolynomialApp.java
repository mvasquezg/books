/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 04: Introducción a la Programacion Orientada a Objetos
*Programa 03: Polinomio ax3+bx+2+cx+d
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