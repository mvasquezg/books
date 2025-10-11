/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 01: Fases en el desarrollo de un programa
*Programa 02: Operaciones Aritmeticas.    
*/

import javax.swing.JFrame;

public class ArithmeticFrame extends JFrame{
    
    private ArithmeticPanel arithPanel=new ArithmeticPanel();

    public ArithmeticFrame(){
        setTitle("Operaciones Aritmeticas Basicas con dos operandos");
        setVisible(true);
        setBounds(300, 250, 450, 250);
        add(arithPanel);
    } 
}