import java.util.Scanner;

public class CookingRecipe{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        System.out.println("***** Recetas de Cocina *****");
        
        System.out.print("Ingresa el nombre: ");
        var name=in.nextLine();
        System.out.print("Ingresa los ingredientes: ");
        var ingredientes=in.nextLine();
        System.out.print("Ingresa el tiempo de preparacion (min): ");
        var time=Integer.parseInt(in.nextLine());
        System.out.print("Ingresa la dificultad (Facil, Media, Dificil): ");
        var dificultad=in.nextLine();
        
        
        System.out.println("\n --- Receta de Cocina ---");
        System.out.println("Nombre Receta: "+name);
        System.out.println("Ingredientes: "+ingredientes);
        System.out.println("Tiempo de preparacion: "+time+" min");
        System.out.println("Dificultad: "+dificultad);
    }
}