/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 05: Imprime Mensaje en pantalla
*/
import javax.swing.JFrame;
public class PrintMessageApp{
    public static void main(String[] args){
        PrintMessageFrame printFrame=new PrintMessageFrame();

        printFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}