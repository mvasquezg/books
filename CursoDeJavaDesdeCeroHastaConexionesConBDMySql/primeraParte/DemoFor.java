/** 
 *Libro: Curso de Java desde Cero hasta Conexiones con Base de Datos MYSQL
 *Primera parte: Iniciación al lenguaje Java
 *Programa 8: Demo bucle for
 */

import javax.swing.JOptionPane;

public class DemoFor{
    
    String message;

    public DemoFor(){
        String valueString=JOptionPane.showInputDialog(null, "Que tabla de multiplicar desea: ");

        try{
            int valueInt=Integer.parseInt(valueString);

            message="Tabla del "+valueString+" \n";

            for(int i=1; i<=10; i++)
            message=message+i+" x "+valueString+" = "+(i*valueInt)+"\n";
        }catch(NumberFormatException ex){
            message="No es un entero.";
        }

        JOptionPane.showMessageDialog(null, message);

    }
    
}