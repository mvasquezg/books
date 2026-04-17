package prjInterfaces.src.com.interfaceclass;

public interface Traductor {

    //public y abstract son implícitos en los métodos de una interfaz, por lo tanto, no es necesario escribirlos.
    void traducir();

    //metodo con implementacion por default.
    default void iniciarTraductor() {
        System.out.println("Iniciando traductor..."); 
    }


}
