/** 
 *Libro: Curso de Java desde Cero hasta Conexiones con Base de Datos MYSQL
 *Primera parte: Iniciación al lenguaje Java
 *Programa 3: Demo JOptionPane
 */

import javax.swing.JOptionPane;

public class DemoJOptionPane{
    String name;

    public DemoJOptionPane(){
        getName();
        showGretting();
    }

    private void getName(){
        this.name=JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
    }
    
    private void showGretting(){
        JOptionPane.showMessageDialog(null, "Hola "+this.name);
    }
}