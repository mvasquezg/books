package prjLambda.src.com;

import java.util.ArrayList;
import java.util.List;

public class FunctionLambda {
     public static void main(String[] args) {
        List<String> dayOfWeek = new ArrayList<>();

        dayOfWeek.add("Lunes");
        dayOfWeek.add("Martes");
        dayOfWeek.add("Miercoles");
        dayOfWeek.add("Jueves");
        dayOfWeek.add("Viernes");
        dayOfWeek.add("Sabado");
        dayOfWeek.add("Domingo");

        dayOfWeek.forEach(el -> {
            System.out.println("Dia de la semana lambda: "+el);
        });
    }
    
}
