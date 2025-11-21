/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 05: Estrructura de un programa
*Programa 01: Grados Centigrados
*/
public class Degrees{
    private double degreesC;

    public void setDegreesC(double degrees){
        this.degreesC=degrees;
    }

    public double getDegreesC(){
        return this.degreesC;
    }

    public double getDegreesF(){
        return 9F/5F*getDegreesC()+32;
    }
}