/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 04: Introducción a la Programacion Orientada a Objetos
*Programa 01: Casteo de tipos de datos
*/

public class CastingData{

    public static void main(String[] args){
        byte dataByte=1; 
        short dataShort=0;
        int dataInt=0;
        long dataLong=0;
        float dataFloat=0;
        double dataDouble=0;

        System.out.println("Conversión Implicita de los tipos de datos: ");
        
        dataShort=dataByte;
        System.out.println("Dato byte a dato short: "+dataShort);

        dataInt=dataShort;
        System.out.println("Dato short a dato int: "+dataInt);

        dataLong=dataInt;
        System.out.println("Dato entero a dato long: "+dataLong);

        dataFloat=dataLong;
        System.out.println("Dato long a dato float: "+dataFloat);

        dataDouble=dataFloat;
        System.out.println("Dato byte a dato short: "+dataDouble);

    }

}