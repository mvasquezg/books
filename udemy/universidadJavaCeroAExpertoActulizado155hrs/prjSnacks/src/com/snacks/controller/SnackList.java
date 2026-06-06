package prjSnacks.src.com.snacks.controller;

import java.util.ArrayList;
import java.util.List;

import prjSnacks.src.com.snacks.bean.Snack;

public class SnackList {
    private static final List<Snack> snackList;

    //Bloque static inicializador para inicializar la lista de snacks
    static {
        snackList = new ArrayList<>();
        snackList.add(new Snack("Papas", 70));
        snackList.add(new Snack("Refresco", 50));
        snackList.add(new Snack("Sandwich", 120));
    }

    public static void addSnack(Snack snack) {
        snackList.add(snack);
    }

    public static void showSnacks() {
        var stockSnacks = "";

        for (Snack snack : snackList) {
            stockSnacks += snack.toString() + "\n";
        }

        System.out.println("--- Snacks en el Inventario ---"); 
        System.out.println(stockSnacks);
    }

    public static List<Snack> getSnackList() {
        return snackList;
    }
}
