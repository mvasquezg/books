package prjList.src.com;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List dayOfWeek = new ArrayList();

        dayOfWeek.add("Lunes");
        dayOfWeek.add("Martes");
        dayOfWeek.add("Miercoles");
        dayOfWeek.add("Jueves");
        dayOfWeek.add("Viernes");
        dayOfWeek.add("Sabado");
        dayOfWeek.add("Domingo");

        for (Object element : dayOfWeek) {
            System.out.println("Dia de la semana: "+element);
        }
    }
}