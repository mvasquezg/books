/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 04: Introducción a la Programacion Orientada a Objetos
*Programa 02: Area de un triangulo
*/
package areatriangle;

import areatriangle.view.frame.AreaTriangleFrame;
import javax.swing.JFrame;

public class AreaTriangleApp{
    public static void main(String[] args){
        AreaTriangleFrame arFrame=new AreaTriangleFrame();

        arFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}