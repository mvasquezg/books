/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 3: Fundamentos de Java 
 *Programa 6: Prueba de operadores
*/

public class OperatorTest{
    public static void main(String[] args){
        int x;
        int y=2;
        double z=3.0;

        x=5;
        System.out.println("x + y + z = " + (x+y+z));

        x+=y;
        y++;
        z--;
        z *= x;

        System.out.println("x + y + z = " + (x+y+z));

    }
}