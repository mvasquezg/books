/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 04: Introducción a la Programacion Orientada a Objetos
*Programa 03: Polinomio ax3+bx+2+cx+d
*/
package polynomial.view.panel;

import polynomial.model.PolynomialModel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PolynomialPanel extends JPanel{
    private JLabel jLblData;
    private PolynomialModel poly=new PolynomialModel();
    String data="";

    public PolynomialPanel(){
        poly.setA(1);
        poly.setB(-3.2);
        poly.setC(0);
        poly.setD(7);

        data+="<HTML>"+poly.getResult(1);
        data+="<br>"+poly.getResult(1.5)+"<HTML>";
        jLblData=new JLabel(data);

        add(jLblData);

    }

}