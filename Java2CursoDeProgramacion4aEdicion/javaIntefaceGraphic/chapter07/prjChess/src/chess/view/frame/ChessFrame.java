/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 09: Bucle FOR aplicada al ajedres. 
*/
package chess.view.frame;

import chess.view.panel.ChessPanel;

import javax.swing.JFrame;

public class ChessFrame extends JFrame{
    private ChessPanel cPanel=new ChessPanel();

    public ChessFrame(){
        setTitle("Ajedrez");
        setBounds(350, 450, 350, 450);

        setVisible(true);

        add(cPanel);
    }
}