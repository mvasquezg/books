/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 04: Introducción a la Programacion Orientada a Objetos
*Programa 02: Area de un triangulo
*/
package areatriangle.view.frame;

import areatriangle.view.panel.AreaTrianglePanel;

import javax.swing.JFrame;

public class AreaTriangleFrame extends JFrame{
    
    private AreaTrianglePanel trPanel=new AreaTrianglePanel();


    public AreaTriangleFrame(){
        setTitle("Area del triangulo");
        setBounds(350, 350, 450, 350);
        setVisible(true);

        add(trPanel);    
    
    }

}