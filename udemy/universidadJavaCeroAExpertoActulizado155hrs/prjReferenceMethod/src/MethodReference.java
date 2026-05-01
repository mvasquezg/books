package prjReferenceMethod.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> dayOfWeek = new ArrayList<>();

        dayOfWeek.add("Lunes");
        dayOfWeek.add("Martes");
        dayOfWeek.add("Miercoles");
        dayOfWeek.add("Jueves");
        dayOfWeek.add("Viernes");
        dayOfWeek.add("Sabado");
        dayOfWeek.add("Domingo");

        dayOfWeek.forEach(System.out::println);

        System.out.println("---- ---- ---- ---- ---- ---- ----  --- ---- ---- ---- ---- ---- ---- ----\nListado de nombres");
        List<String> names=Arrays.asList("Pedro", "Ivonne", "Nohemi", "Paola");
        
        names.forEach(System.out::println);
    }   
}
