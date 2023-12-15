/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 04.Un cliente ejecuta un pedido a una fábrica. La fábrica examina en su banco de datos la ficha del cliente, 
    si el cliente es solvente entonces la empresa acepta el pedido; en caso contrario, rechazará el pedido.
*/
public class StatusCustomer{
    public static void main(String[] args){
        int statusCustomer=0; //Cliente status 1= solvente
        
        System.out.println("Pedido leido");
        
        System.out.println(statusCustomer==1?"Pedido aprobado":"Pedido rechazado");
    }
}    