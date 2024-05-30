/** 
 *Libro: Curso de Java desde Cero hasta Conexiones con Base de Datos MYSQL
 *Primera parte: Iniciación al lenguaje Java
 *Programa 4: Demo If-Else
 */

import javax.swing.JOptionPane;

public class DemoIfElse{
    String name;

    public DemoIfElse(){
        getName();
        showGretting();
    }

    private void getName(){
        this.name=JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
    }
    
    private void showGretting(){
        
        if(name==null){
            JOptionPane.showMessageDialog(null, "Oprimiste el boton Cancelar");    
        }else{
            JOptionPane.showMessageDialog(null, "Hola "+this.name);
        }
        
    }
}