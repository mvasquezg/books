/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 3: Fundamentos de Java 
 *Programa 9: Uso del metodo equals y equalsIgnoreCase
 */

public class MethodEquals{
    public static void main(String[] args){
        String animal1="CaballoMosca";
        String animal2="caballomosca";

        System.out.println("Metodo equals: "+animal1+" es igual a "+animal2+"? "+animal1.equals(animal2));
        System.out.println("Metodo equalsIgnoreCase: "+animal1+" es igual a "+animal2+"? "+animal1.equalsIgnoreCase(animal2));
    }
}