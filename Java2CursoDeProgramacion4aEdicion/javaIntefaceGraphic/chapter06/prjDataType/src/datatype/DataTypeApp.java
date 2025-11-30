/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 03: Imprimir datos de cada tipo
*/
package datatype;

import datatype.view.frame.DataTypeFrame;

import javax.swing.JFrame;

public class DataTypeApp{
    public static void main(String[] args){
        DataTypeFrame dtFrame=new DataTypeFrame();

        dtFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}