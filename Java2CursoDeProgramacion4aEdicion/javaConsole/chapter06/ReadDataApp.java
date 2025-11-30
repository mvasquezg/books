/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 04: Creando una clase leer
*/

public class ReadDataApp{
    public static void main(String[] args){
        short dataShort=0;
        int dataInt=0;
        long dataLong=0;
        float dataFloat=0;
        double dataDouble=0;

        System.out.print("Ingresa un dato short: ");
        dataShort=ReadData.getDataShort();

        System.out.print("Ingresa un dato int: ");
        dataInt=ReadData.getDataInt();

        System.out.print("Ingresa un dato long: ");
        dataLong=ReadData.getDataLong();

        System.out.print("Ingresa un dato float: ");
        dataFloat=ReadData.getDataFloat();

        System.out.print("Ingresa un dato double: ");
        dataDouble=ReadData.getDataDouble();

        System.out.println();
        System.out.println(dataShort);
        System.out.println(dataInt);
        System.out.println(dataLong);
        System.out.println(dataFloat);
        System.out.println(dataDouble);
        System.out.println();
        

    
    }
}