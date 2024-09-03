
/** 
 *Libro: Curso de Java desde Cero hasta Conexiones con Base de Datos MYSQL
 *Primera parte: Iniciación al lenguaje Java
 *Programa 6: Demo while
 */

import javax.swing.JOptionPane;

public class DemoWhile{
    String name;

    public DemoWhile(){
        getName();
        showGretting();
    }

    private void getName(){
        this.name=JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
    }
    
    private void showGretting(){
        
        while(name==null || name.equals("")){
            this.name=JOptionPane.showInputDialog(null, "Debes ingresar tu nombre: ");
        }

        JOptionPane.showMessageDialog(null, "Hola "+this.name);  
    }
}