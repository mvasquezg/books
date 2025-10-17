/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 03: Numero Par
*/

import javax.swing.JFrame;

public class EvenNumberFrame extends JFrame{
    EvenNumberPanel evenPanel=new EvenNumberPanel();

        public EvenNumberFrame(){
            setTitle("Numerp par o impar");
            setBounds(300, 300, 300, 300);
            setVisible(true);

            add(evenPanel);
        }

}