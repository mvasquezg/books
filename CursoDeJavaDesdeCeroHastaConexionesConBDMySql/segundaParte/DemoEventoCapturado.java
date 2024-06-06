/** 
 *Libro: Curso de Java desde Cero hasta Conexiones con Base de Datos MYSQL
 *Segunda parte: Aplicacion de Ejemplo
 *Programa 4: Demo evento capturado
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/*Las clases ActionListener y ActionEvent
    son de la libreria awt(Abstract Windows Tooklkit)
*/
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*Las interfaces se implemnetan despues de 
la definicion de exxtends*/

public class DemoEventoCapturado extends JFrame implements ActionListener{

    JButton btnBoton;

    public DemoEventoCapturado(){
        organizeComponents();
        pack();
        setVisible(true);
    }

    private void organizeComponents(){
        JPanel panel=new JPanel();
        btnBoton=new JButton("Haz click");
        

        /**
         * A los objetos que pueden recibir el click
         * debe agregarsele un action listener
         * que lo reciben de la implmentacion de la clase actual (this)
         */

        btnBoton.addActionListener(this);

        add(panel);

        panel.add(btnBoton);
    }

    /**
     * Todos los objetos que tienen un ActionListener de la clase
     * remitiran el flujo del programa a este metodo
     * que es obligatorio y su sintaxis es asi como se muestra
     */

    public void actionPerformed(ActionEvent evt){
        JOptionPane.showMessageDialog(this, "Gracias");
    }

}