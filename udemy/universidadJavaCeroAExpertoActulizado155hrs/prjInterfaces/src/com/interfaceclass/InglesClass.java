package prjInterfaces.src.com.interfaceclass;

public class InglesClass implements Traductor { // La clase InglesClass implementa la interfaz Traductor, por lo tanto, la clase InglesClass debe implementar el método traducir() de la interfaz Traductor.
    
    @Override
    public void traducir() {
        System.out.println("Traduciendo al inglés...");
    }
    
}
