/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 04.Un cliente ejecuta un pedido a una fábrica. La fábrica examina en su banco de datos la ficha del cliente, 
    si el cliente es solvente entonces la empresa acepta el pedido; en caso contrario, rechazará el pedido.
*/
using System;
class StatusCustomer{
    public static void Main(string[] args){
        
        int statusCustomer=1; //Cliente status 1= solvente

        System.Console.Write("Pedido leido\n");

        if(statusCustomer==1){
            System.Console.Write("Pedido aprobado\n");
        }else{
            System.Console.Write("Pedido rechazado\n");
        }
    }
}    