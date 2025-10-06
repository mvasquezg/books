/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 01: Fases en el desarrollo de un programa
*Programa 01: Mostrar un mensaje de saludo en pantalla.    
*/

import javax.swing.JFrame;
public class GreetingApp{
    public static void main(String[] args){
        GreetingFrame frmGreeting=new GreetingFrame();

        frmGreeting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}