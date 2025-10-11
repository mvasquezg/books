/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 01: Fases en el desarrollo de un programa
*Programa 03: Operaciones Aritmeticas con tres digitos.    
*/
import javax.swing.JFrame;

public class ArithmeticFrame extends JFrame{
    private ArithmeticPanel artPanel=new ArithmeticPanel();

    public ArithmeticFrame(){
        setTitle("Operaciones aritmeticas con 3 números");
        setVisible(true);
        setBounds(300, 250, 550, 350);
        add(artPanel);
    }

}