/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 05: Estrructura de un programa
*Programa 01: Grados Centigrados
*/
package degrees.model;

public class DegreesModel{
    public final int LIM_INFERIOR=-30;
    public final int LIM_SUPERIOR=100;
    public final int INCREMENT=6;

    private double degreesC=0;

    public void setDegreesC(double degrees){
        this.degreesC=degrees;
    }

    public double getDegreesC(){
        return this.degreesC;
    }

    public double getDegreesF(){
        return 9F/5F*getDegreesC()+32;
    }

    public int getIncrement(){
        return INCREMENT;
    }

}