/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 3: Fundamentos de Java 
 *Programa 7: Uso del metodo  charAt
*/

public class MethodCharAt{
    public static void main(String[] args){
        String animal="mamut";
        System.out.println("Animal: " + animal);

        //System.out.println("Ultima letra de "+animal+" = "+animal.charAt(5)); //maca error, ya que el indice esta fuera de rango
        System.out.println("Ultima letra de "+animal+" = "+animal.charAt(4));
    }
}