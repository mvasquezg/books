public class FormatString{
    public static void main(String[] args){
        var name="Matias";
        var age=35;
        var salary=21000.50;

        //string.format
        var message=String.format("Nombre: %s, Edad: %d años, Salario: $ %.2f", name, age, salary);

        System.out.println(message);

        //Metodo printf();
        System.out.printf("Nombre: %s, Edad: %d años, Salario: $ %.2f%n", name, age, salary);

        var numEmployee=12;
        //Formateo utilixando con text block
        message="""
            %nDetalle Persona:\s
            -------------------------
            \tNombre: %s
            \tNumero Empleado: %04d
            \tEdad: %d años
            \tSalario. $ %.2f
        """.formatted(name, numEmployee, age, salary);

        System.out.println(message);

        //Formateo con text block y printf    
        System.out.printf("""
            %nDetalle Persona:\s
            -------------------------
            \tNombre: %s
            \tNumero Empleado: %04d
            \tEdad: %d años
            \tSalario. $ %.2f
        """,name, numEmployee, age, salary);
    }
}