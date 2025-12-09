/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 10: Programa que calcula el siguiiente polinomio 
                3x^5 - 5x^3 +2x -7
*/

package polynomial.view.frame;

import polynomial.view.panel.PolynomialPanel;

import javax.swing.JFrame;

public class PolynomialFrame extends JFrame{
    private PolynomialPanel polyPanel=new PolynomialPanel();

    public PolynomialFrame(){
        setTitle("Polinomio 3x^5 - 5x^3 +2x -7");
        setBounds(250, 450, 450, 450);
        setVisible(true);
        
        add(polyPanel);
    }
}