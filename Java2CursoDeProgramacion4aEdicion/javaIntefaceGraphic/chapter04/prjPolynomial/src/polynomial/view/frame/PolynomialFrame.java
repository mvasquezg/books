/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 04: Introducción a la Programacion Orientada a Objetos
*Programa 03: Polinomio ax3+bx+2+cx+d
*/
package polynomial.view.frame;

import polynomial.view.panel.PolynomialPanel;

import javax.swing.JFrame;

public class PolynomialFrame extends JFrame{
    private PolynomialPanel polyPanel=new PolynomialPanel();

    public PolynomialFrame(){
        setTitle("Polinomio");
        setBounds(350, 350, 450, 350);
        setVisible(true);

        add(polyPanel);
    }
    
}