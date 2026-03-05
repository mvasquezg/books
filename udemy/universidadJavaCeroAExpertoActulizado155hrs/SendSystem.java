import java.util.Scanner;

public class SendSystem{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        final var NACIONAL=10.00;
        final var INTERNACIONAL=20.00;
        var monto=0.0;

        System.out.println("*** Sistema de Envios *** ");
        
        System.out.print("Ingresa el destino del paquete (NACIONAL/INTERNACIONAL): ");
        var tipoEnvio=in.nextLine();

        System.out.print("Ingresa el peso del paquete: ");
        var paqueteKg=in.nextDouble();

        if(tipoEnvio.equalsIgnoreCase("NACIONAL")){
            monto=NACIONAL*paqueteKg;
        }else{
            monto=INTERNACIONAL*paqueteKg;
        }

        System.out.printf("\n\n------------ DATOS DEL ENVIO ------------\nDestino: %s\nPrecio Destino: $ %.2f\nPeso a enviar: %.2f KG\nMonto a pagar: $ %.2f\n\n", tipoEnvio.toUpperCase(),(tipoEnvio.equalsIgnoreCase("Nacional")?NACIONAL:INTERNACIONAL), paqueteKg, monto);


    }
}