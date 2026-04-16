package prjAbstractClass.src.com.classabstract;

public class Circle extends GeometricPicture { // La clase Circle hereda de la clase abstracta GeometricPicture, por lo tanto, la clase Circle debe implementar el método draw() de la clase abstracta GeometricPicture.
    
    @Override
    public void draw() {
        System.out.println("Dibujando un círculo...");
    }
    
}
