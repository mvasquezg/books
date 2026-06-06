package prjMaps.src.com;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {
        Map <String, String> person = new HashMap<>();
        person.put("name", "Carlos");
        person.put("lastName", "Rodriguez");  
        person.put("age", "30");
        person.put("age", "30"); // No se permite duplicados, por lo que se actualiza el valor de la clave "age" a "30"**

        System.out.println("\nInformación de la persona:\n ");
        person.entrySet().forEach(System.out::println);
        
        person.put("age", "31"); // Actualizamos el valor de la clave "age" a "31"
        
        System.out.println("\nInformación de la persona después de actualizar la edad:\n ");
        person.entrySet().forEach(System.out::println);

        person.remove("lastName"); // Removemos la clave "lastName" y su valor asociado
        System.out.println("\nInformación de la persona después de eliminar el apellido:\n ");
        person.entrySet().forEach(System.out::println);

        //Iterar sobre los elementos por separado del mapa utilizando forEach
        person.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
