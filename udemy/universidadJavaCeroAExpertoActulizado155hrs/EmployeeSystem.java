import java.util.Scanner;

public class EmployeeSystem{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Nombre del empleado: ");
        var nameEmployee=in.nextLine();

        System.out.print("Edad del empleado: ");
        var ageEmployee=Integer.parseInt(in.nextLine());

        System.out.print("Salario del empleado: ");
        var salaryEmployee=Double.parseDouble(in.nextLine());

        System.out.print("El empleado es Jefe (true/false): ");
        var isBoss= Boolean.parseBoolean(in.nextLine());

        System.out.println("\n*** Informacion completa ***");
        System.out.println("\tNombre: "+nameEmployee);
        System.out.println("\tEdad: "+ageEmployee+" años");
        //System.out.println("Salario: "+salaryEmployee);
        //System.out.println("\tSalario: $ %.2f".formatted(salaryEmployee));
        System.out.printf("\tSalario: $ %.2f%n",salaryEmployee);
        System.out.println("\tJefe: "+isBoss);



    }
}