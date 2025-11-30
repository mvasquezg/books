/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 03: Imprimir datos de cada tipo
*/
package datatype.view.frame;

import datatype.view.panel.DataTypePanel;

import javax.swing.JFrame;

public class DataTypeFrame extends JFrame{
    private DataTypePanel dtPanel=new DataTypePanel();

    public DataTypeFrame(){
        setTitle("Tipos de datos en java");
        setBounds(300, 300, 450, 350);
        setVisible(true);

        add(dtPanel);
    }
}
