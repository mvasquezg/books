/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 09: Bucle FOR aplicada al ajedres. 
*/
package chess;

import chess.view.frame.ChessFrame;

import javax.swing.JFrame;


public class ChessApp{
    public static void main(String[] args){
        ChessFrame cFrame=new ChessFrame();

        cFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}