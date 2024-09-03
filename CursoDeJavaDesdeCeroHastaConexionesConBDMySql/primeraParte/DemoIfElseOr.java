
/** 
 *Libro: Curso de Java desde Cero hasta Conexiones con Base de Datos MYSQL
 *Primera parte: Iniciación al lenguaje Java
 *Programa 5: Demo if-else Or
 */

import javax.swing.JOptionPane;

public class DemoIfElseOr{
    String name;

    public DemoIfElseOr(){
        getName();
        showGretting();
    }

    private void getName(){
        this.name=JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
    }
    
    private void showGretting(){
        
        if(name==null || name.equals("")){
            JOptionPane.showMessageDialog(null, "No ingresates tu nombre");    
        }else{
            JOptionPane.showMessageDialog(null, "Hola "+this.name);
        }
        
    }
}