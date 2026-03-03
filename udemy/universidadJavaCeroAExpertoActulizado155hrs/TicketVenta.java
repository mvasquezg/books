import java.util.Scanner;

public class TicketVenta{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.println("*** Ticket Venta ***");

        //Pdidiendo precios
        System.out.print("Precio Leche: ");
        var precioLeche=in.nextDouble();

        System.out.print("Precio Pan: ");
        var precioPan=in.nextDouble();

        System.out.print("Precio Lechuga: ");
        var precioLechuga=in.nextDouble();

        System.out.print("Precio Platanos: ");
        var precioPlatanos=in.nextDouble();

        System.out.print("Aplicar descuento (%): ");
        var descuentoPorcentaje=in.nextInt();


        //Calculo del subtotal sin impuestos
        var subTotal=precioLeche+precioPan+precioLechuga+precioPlatanos;

        //Aplicar dewscuento
        var descuento=subTotal*(descuentoPorcentaje/100.0);

        //Subtotal con descuento
        var subTotalDescuento=subTotal-descuento;

        //calcular el impuesto (16%)
        //var impuesto=subTotal*.16;

        var impuesto=subTotalDescuento*.16;

        //Calculo con impuiesto
        //var costoTotal=subTotal+impuesto;
        var costoTotal=subTotalDescuento+impuesto;

        System.out.printf("""
        \nSubtotal: $ %.2f
        Descuento: $ %.2f (%d%%)
        Impuesto (16%%): $ %.2f
        Total de la compra: $ %.2f
        """, subTotal, descuento, descuentoPorcentaje ,impuesto, costoTotal);



    }   
}