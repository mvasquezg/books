/** 
 *Libro: Curso de Java desde Cero hasta Conexiones con Base de Datos MYSQL
 *Primera parte: Iniciación al lenguaje Java
 *Programa 9: Demo switch
 */

import javax.swing.JOptionPane;

public class DemoSwitch{
    String message;

    public DemoSwitch(){
        String califString=JOptionPane.showInputDialog(null, "Escriba la calificacion con numero: ");

        try{
            int califInt=Integer.parseInt(califString);

            String calif;

            switch(califInt){
                case 0: calif="NA"; break;
                case 1: calif="NA"; break;
                case 2: calif="NA"; break;
                case 3: calif="NA"; break;
                case 4: calif="NA"; break;
                case 5: calif="NA"; break;
                case 6: calif="S"; break;
                case 7: calif="S"; break;
                case 8: calif="B"; break;
                case 9: calif="MB"; break;
                case 10: calif="MB"; break;
                default: calif="Ivalida"; break;
            }
            message="La calificacion es: "+calif;
        }catch(NumberFormatException ex){
            message="No escribio un numero";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
    