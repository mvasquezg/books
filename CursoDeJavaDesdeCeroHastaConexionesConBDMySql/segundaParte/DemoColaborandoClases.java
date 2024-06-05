/** 
 *Libro: Curso de Java desde Cero hasta Conexiones con Base de Datos MYSQL
 *Segunda parte: Aplicacion de Ejemplo
 *Programa 1: Hola mundo usando JFrame, JPanel, JLabel sin prientacion a objetos
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class DemoColaborandoClases{

    public DemoColaborandoClases(){
        JFrame window=new JFrame();
        JPanel panel=new JPanel();
        JLabel label=new JLabel();

        //asigna un texto a la etiqueta
        label.setText("Hola mundo");

        //agrega la etiqueta al panel
        panel.add(label);

        //agrega el panel a la ventana
        window.add(panel);

        //ajusta el tamaño de la ventana al minimo necesario
        window.pack();

        //asigna el estado de visibilidad de la ventana a verdadero
        window.setVisible(true);


    }
}