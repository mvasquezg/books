/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 3: Fundamentos de Java 
 *Programa 4: Conversion de temperatura de grados fahrenheit en grados celsius. 
*/

public class TemperatureConverter{
    public static void main(String[] args){
        final double FREEZING_POINT=32.0;
        final double CONVERSION_FACTOR=5.0/9.0;         
        
        double fahrenheit = 50;
        double celsius;

        celsius=CONVERSION_FACTOR*(fahrenheit-FREEZING_POINT);
        

        System.out.println(fahrenheit+" grados fahrenheit = " + celsius+ " grados celsius");
    }
}