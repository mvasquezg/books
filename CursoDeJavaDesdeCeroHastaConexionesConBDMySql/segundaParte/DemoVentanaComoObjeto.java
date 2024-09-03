/** 
 *Libro: Curso de Java desde Cero hasta Conexiones con Base de Datos MYSQL
 *Segunda parte: Aplicacion de Ejemplo
 *Programa 2: Demo Ventana como Objeto
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class DemoVentanaComoObjeto{

    public DemoVentanaComoObjeto(){
        JFrame window=new JFrame();
        JPanel panel=new JPanel();
        JLabel label=new JLabel();

        /*Tratamos la ventana como objeto*/
        Object objWindow=window;

        /*
            Usamos el metodo getClass() de la clase Objetc
            y el getString() de Class para obtener
            el nombre de la clase a la que pertenece ventana
        */
        String classObject=objWindow.getClass().toString();

        label.setText(classObject);

        panel.add(label);
        window.add(panel);
        window.pack();
        window.setVisible(true);

    }

}