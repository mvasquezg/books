/** 
 *Libro: Curso de Java desde Cero hasta Conexiones con Base de Datos MYSQL
 *Primera parte: Iniciación al lenguaje Java
 *Programa 2: Mensaje en consola hola mundo orientado a objetos
 */
public class HelloWorldOO{
    String greeting;
    
    public HelloWorldOO(){
        greeting="Hola mundo";
    }

    public void showGreeting(){
        System.out.println(greeting);
    }
}