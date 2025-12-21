/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 07: Bucle anidado While, teorema de pitagoras. 
*/
package theorem.view.panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PythagoreanTheoremPanel extends JPanel{
    private JLabel jLblResult=new JLabel("");

    public PythagoreanTheoremPanel(){
        String result="<HTML>";
        int x=1, y=1, z=0;

        result+="Z&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;X&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Y<br>";
        result+="--------------------------------<br>";
        
        while(x<=50){
            
            //Calcular Z. Como Z es un entero, almacena la parte entera
            //de la raiz cuadrada
            z=(int) Math.sqrt(x*x + y*y);

            while(y<=50 && z<=50){
               //Si la raiz cuadrada  anterior fue exacta, escribir x, y ,z
               if(z*z == x*x + y*y){
                result+=z+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+x+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+y+"<br>";
               }

               y+=1;
               z=(int) Math.sqrt(x*x+y*y);

            }//end y,z while 

            x+=1;
            y=x;

        }//end x while
        result+="<HTML>";
        jLblResult.setText(result);

        add(jLblResult);
    }
}