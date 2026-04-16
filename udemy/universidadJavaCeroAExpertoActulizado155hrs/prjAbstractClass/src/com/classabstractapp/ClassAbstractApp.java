package prjAbstractClass.src.com.classabstractapp;

import prjAbstractClass.src.com.classabstract.GeometricPicture;
import prjAbstractClass.src.com.classabstract.Rectangle;
import prjAbstractClass.src.com.classabstract.Circle;

public class ClassAbstractApp {
    public static void main(String[] args) {
        //GeometricPicture picture=new GeometricPicture(); // No se puede crear un objeto de una clase abstracta, por lo tanto, esta línea de código generará un error de compilación.
        GeometricPicture rectangle = new Rectangle();   // Se puede crear un objeto de una clase que hereda de una clase abstracta, por lo tanto, esta línea de código es válida.
        
        GeometricPicture circle = new Circle();

        rectangle.draw();
        System.out.println("-------------");
        circle.draw();
    }
}
