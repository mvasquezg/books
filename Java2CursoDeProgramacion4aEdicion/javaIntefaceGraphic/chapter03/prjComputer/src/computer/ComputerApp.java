/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 02: Clase Computadora
*/

/***
 * Ejecuar el proyecto desde consola
 * --------------- Comando para compilar desde la consola en paquetes ---------------
  $> javac -sourcepath ./src/ -d ./bin/ ./src/bank/BanKAccountApp

  Para ejecutar desde la consola, se debe posicionar en el pathc antes del nombre del paquete
  y desde ahi ejecutar el comando.
  
  java -cp Documents/books/Java2CursoDeProgramacion4aEdicion/javaIntefaceGraphic/chapter03/prjBankAccount/bin/ bank.BankAccountApp
   
   o desde la ruta
   ../prjBankAccount
    java -cp bin/ bank.BankAccountApp
 * 
 */

package computer;

import computer.view.frame.ComputerFrame;

import javax.swing.JFrame;

public class ComputerApp{

    public static void main(String[] args){
        ComputerFrame compFrame=new ComputerFrame();

        compFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}