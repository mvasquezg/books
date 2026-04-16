package prjArgumentosVariables.src.com;

public class ArgumentoVariables {
    
    static void printParameters(String name, int... numbers) {
        System.out.println("Nombre:  "+name);
        printNumbers(numbers);
        System.out.println("\n" );
    }

    static void printNumbers(int... numbers) {
        System.out.println("Números recibidos:");
        for (int number : numbers) {
            System.out.print(number+" ");
        }
        System.out.println("\n" );
    }

    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);
        printParameters("Alice", 10, 20);
    }
}
