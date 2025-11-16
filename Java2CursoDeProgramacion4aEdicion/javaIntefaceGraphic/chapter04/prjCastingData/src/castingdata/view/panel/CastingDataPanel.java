/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 04: Introducción a la Programacion Orientada a Objetos
*Programa 01: Casteo de tipos de datos
*/
package castingdata.view.panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CastingDataPanel extends JPanel{
    private JLabel jLblData;

    public CastingDataPanel(){
        byte dataByte=1; 
        short dataShort=0;
        int dataInt=0;
        long dataLong=0;
        float dataFloat=0;
        double dataDouble=0;

        String message="";

        message+="<HTML>Conversión Implicita de los tipos de datos: ";
        
        dataShort=dataByte;
        message+="<br>Dato byte a dato short: "+dataShort;

        dataInt=dataShort;
        message+="<br>Dato short a dato int: "+dataInt;

        dataLong=dataInt;
        message+="<br>Dato entero a dato long: "+dataLong;

        dataFloat=dataLong;
        message+="<br>Dato long a dato float: "+dataFloat;

        dataDouble=dataFloat;
        message+="<br>Dato byte a dato short: "+dataDouble+"<HTML>";
        
        jLblData=new JLabel(message);

        add(jLblData);
    }

}