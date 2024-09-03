/** 
 *Libro: Introducción al lenguaje de programación Java. Una guía básica.
 *Capitulo 5: Clases en Java
 *Programa 2: Paso por referencias App 
 */

public class PointApp{
    private static void changeReference(Point localPoint){
        localPoint=new Point(1.0f, 2.0f);
        System.out.println("Estoy dentro del metodo");
        //localPoint.print();
    }

    public static void main(String[] args){
        Point aPoint=new Point();

        System.out.println("estoy fuera del metodo\n");
        //aPoint.print();
        changeReference(aPoint);
        System.out.println("estoy fuera del metodo\n");
        //aPoint.print();
    }
}