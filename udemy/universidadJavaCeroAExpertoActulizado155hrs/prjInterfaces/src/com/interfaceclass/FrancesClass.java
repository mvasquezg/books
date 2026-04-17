package prjInterfaces.src.com.interfaceclass;

public class FrancesClass implements Traductor { // La clase FrancesClass implementa la interfaz Traductor, por lo tanto, la clase FrancesClass debe implementar el método traducir() de la interfaz Traductor.
    
    @Override
    public void traducir() {
        System.out.println("Traduciendo al francés...");
    } 
    
    @Override
    public void iniciarTraductor() { // Sobrescribimos el método iniciarTraductor() de la interfaz Traductor, para que muestre un mensaje diferente al iniciar el traductor de francés.
        System.out.println("Iniciando traductor en francés..."); 
    }
}
