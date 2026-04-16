package prjAbstractClass.src.com.classabstract;

public class Rectangle extends GeometricPicture { // La clase Rectangle hereda de la clase abstracta GeometricPicture, por lo tanto, la clase Rectangle debe implementar el método draw() de la clase abstracta GeometricPicture.
    
    @Override
    public void draw() {
        System.out.println("Dibujando un rectángulo...");
    }
    
}
