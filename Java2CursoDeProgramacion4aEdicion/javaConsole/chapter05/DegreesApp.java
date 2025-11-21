/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 05: Estrructura de un programa
*Programa 01: Grados Centigrados
*/
public class DegreesApp{
   //constantes
   final static int LIM_INFERIOR=-30;
   final static int LIM_SUPERIOR=100;
   final static int INCREMENT=6;
   
   public static void main(String[] args){
        Degrees degrees=new Degrees();
        int degreesCelsius=LIM_INFERIOR;
        double degreesFahrenheit=0;

        while(degreesCelsius<=LIM_SUPERIOR){
            degrees.setDegreesC(degreesCelsius);
            degreesFahrenheit=degrees.getDegreesF();

            System.out.println(degreesCelsius+" C\t"+degreesFahrenheit+" F");
            degreesCelsius+=INCREMENT;
        }             
   }
}