
/** 
 *Libro: Curso de Java desde Cero hasta Conexiones con Base de Datos MYSQL
 *Primera parte: Iniciación al lenguaje Java
 *Programa 7: Demo tryCatch
 */

import javax.swing.JOptionPane;

public class DemoTryCatch{
    String message;

    public DemoTryCatch(){
        /*String stringValue=JOptionPane.showInputDialog(null, "Escribe un entero");

        int valueNumber=Integer.parseInt(stringValue);
        JOptionPane.showMessageDialog(null, "El valor es: "+valueNumber);*/

        String stringValue=JOptionPane.showInputDialog(null, "Escribe un entero");
        try{
            int valueNumber=Integer.parseInt(stringValue);
            message="Gracias";
        }catch(NumberFormatException ex){
            message="No escribistes un entero.";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}