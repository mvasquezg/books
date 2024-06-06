/** 
 *Libro: Curso de Java desde Cero hasta Conexiones con Base de Datos MYSQL
 *Segunda parte: Aplicacion de Ejemplo
 *Programa 3: Demo hereda del JFrame
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class DemoHeredaJFrame extends JFrame{

    public DemoHeredaJFrame(){
        /**
         * Observese que a estos tres metodos los usamos igual
         * aunque solo organizarComponents() esta escrito en el
         * bloque de codigo de la clase
         * los otros dos los heredamos de alguna de las clases del linaje del JFrame
         */
          organizeComponents();
          pack();
          setVisible(true);  
    }

    private void organizeComponents(){
        JPanel panel=new JPanel();

        JLabel label=new JLabel();

        label.setText("Hola Mundo");

        add(panel);

        panel.add(label);
    }

}