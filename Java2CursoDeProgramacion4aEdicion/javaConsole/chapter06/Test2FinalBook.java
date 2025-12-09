/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 13: Verificar la salida del programa*/

import java.io.PrintStream;
import java.io.IOException;

public class Test2FinalBook{
    public static void main(String[] args){
        PrintStream flujoS=System.out;
        
        char car1='A', car2=65, car3=0;

        car3=(char) (car1+ 'a' - 'A');

        flujoS.println(car3 + " = "+ (int) car3);
        
        car3=(char) (car2+32);
        flujoS.println(car3 + " = "+ (int) car3);
    }
}