package prjSnacks.src.com.snacks.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import prjSnacks.src.com.snacks.bean.Snack;
import prjSnacks.src.com.snacks.controller.SnackList;

public class MachineSnacksApp {
    public static void main(String[] args) {
        snackMachine();

    }

    public static void snackMachine() {
        var exitWhile = false;

        var in=new Scanner(System.in);

        //1.-Crear la lista de prodcutos de tipo Snack
        List<Snack> listProducts = new ArrayList<>();
        
        System.out.println("***** Bienvenido a la Máquina de Snacks *****");  
        SnackList.showSnacks();//Muestra el inventario de snacks disponibles al iniciar la aplicación
        
        //2.-Mostrar el menú de opciones al usuario 
        //3.-Leer la opción del usuario
        //4.-Ejecutar la opción seleccionada por el usuario
        while (!exitWhile) {
            try{
                var option = showMenu(in);
                exitWhile=executeOptions(option, in, listProducts);
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
                in.nextLine(); // Limpiar el buffer del scanner
            }finally{
                System.out.println();//Imprime un salto de linea con cada iteración del menú para mejorar la legibilidad de la consola
            }
            
            }
        }
    
        private static boolean executeOptions(int option, Scanner in, List<Snack> listProducts) {
            var exitMethod = false;

            switch (option) {
                case 1 -> buySnack(in, listProducts);
                case 2-> showTickets(listProducts);
                case 3-> addNewSnack(in);               
                case 4 -> {
                    System.out.println("Gracias por usar la Máquina de Snacks. ¡Hasta luego!");
                    exitMethod = true;
                }
                default -> System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
                return exitMethod;
        }

        private static void addNewSnack(Scanner in) {
            System.out.print("Ingresa el nombre del nuevo snack: ");
            var name = in.nextLine();
            System.out.print("Ingresa el precio del nuevo snack: ");
            var price = Double.parseDouble(in.nextLine());
            var newSnack = new Snack(name, price);
            SnackList.addSnack(newSnack);
            System.out.println("Nuevo snack agregado: " + newSnack);
            SnackList.showSnacks(); // Mostrar el inventario actualizado después de agregar un nuevo snack
        }

        private static void showTickets(List<Snack> listProducts) {
            var ticket = "\n*** Ticket de Compra ***\n";
            var total = 0.0;
            for(var product: listProducts){
                ticket += product.getName() + " - $" + product.getPrice() + "\n";
                total += product.getPrice();
            }
            ticket += "\n\tTotal a pagar: $" + total;
            System.out.println(ticket);
        }

        private static void buySnack(Scanner in, List<Snack> listProducts) {
            System.out.print("¿Que es snack deseas comprar? (Ingresa el ID del snack): ");
            var  idSnack = Integer.parseInt(in.nextLine());
            
            //Validar que el ID del snack ingresado por el usuario exista en la lista de snacks disponibles
            var snackEncontrado=false;

            for(var snack: SnackList.getSnackList()){
                if(snack.getIdSnack()==idSnack){
                    listProducts.add(snack);
                    System.out.println("Has comprado: " + snack.getName() + " por $" + snack.getPrice());
                    snackEncontrado=true;
                    break;
                }

            }

            if(!snackEncontrado){
                System.out.println("No se encontró un snack con el ID:"+idSnack+" ingresado. Por favor, intenta de nuevo.");
            }
        }

        private static int showMenu(Scanner in) {
        System.out.print("""
        --- Menú de Opciones ---
        1.-Comprar Snack
        2. Mostrar Tickets
        3. Agregar un nuevo snack
        4. Salir
        Elige una opción:\s """);
        //Se lee la opción del usuario y se retorna para ser procesada en el switch del método snackMachine
        return Integer.parseInt(in.nextLine()); 
        
    }
}