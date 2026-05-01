package prjGeneric.src.com;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    
    public static void main(String[] args) {
        List<String> dayOfWeek = new ArrayList<>();

        dayOfWeek.add("Lunes");
        dayOfWeek.add("Martes");
        dayOfWeek.add("Miercoles");
        dayOfWeek.add("Jueves");
        dayOfWeek.add("Viernes");
        dayOfWeek.add("Sabado");
        dayOfWeek.add("Domingo");

        for (String el : dayOfWeek) {
            System.out.println("Dia de la semana generico: "+el);
        }
    }
}
