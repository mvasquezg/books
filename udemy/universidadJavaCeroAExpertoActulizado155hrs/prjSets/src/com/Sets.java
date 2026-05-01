package prjSets.src.com;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();

        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Ana");
        conjunto.add("Luis");

        System.out.println("Elementos del conjunto (SET): ");
        conjunto.forEach(System.out::println);

        //Remover un elemento del conjunto
        conjunto.remove("Ana");
        System.out.println("Elementos del conjunto (SET) después de remover a Ana: ");
        conjunto.forEach(System.out::println);
    }
}
