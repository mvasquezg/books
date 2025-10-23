/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 01: Clase Cuenta --(ventana principal)
*/
package bank.view.frame;

import bank.view.panel.BankMainPanel;

import javax.swing.JFrame;

public class BankMainFrame extends JFrame{
   BankMainPanel bankPanel=new BankMainPanel();
   
   public BankMainFrame(){
        setTitle("Ventana Principal del Banco");
        setBounds(300, 300, 650, 450);
        setVisible(true);
        
        add(bankPanel);
    }
}