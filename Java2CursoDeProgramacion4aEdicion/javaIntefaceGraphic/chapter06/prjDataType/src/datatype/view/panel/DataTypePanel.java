/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 03: Imprimir datos de cada tipo
*/
package datatype.view.panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DataTypePanel extends JPanel{
    private JLabel jLblData;

    public DataTypePanel(){
        String sString="Lenguaje Java";
        char[] cArrayChar={'a', 'b', 'c'};
        int dataInt=4;
        long dataLong=Long.MIN_VALUE;
        float dataFloat=Float.MAX_VALUE;
        double dataDouble=Math.PI;
        boolean dataBoolean=true;

        jLblData=new JLabel("<HTML>"+sString+"<br>"+cArrayChar[0]+" "+cArrayChar[1]+" "+cArrayChar[2]+"<br>"+dataInt+"<br>"+dataLong+"<br>"+dataDouble+"<br>"+dataFloat+"<br>"+dataBoolean+"<HTML>");

        add(jLblData);
    }

}
