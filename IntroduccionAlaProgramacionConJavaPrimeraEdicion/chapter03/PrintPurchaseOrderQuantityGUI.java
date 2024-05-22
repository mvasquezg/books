/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 3: Fundamentos de Java 
 *Programa 14: Orden de compra con interfaz grafica
 */
import javax.swing.JOptionPane;

public class PrintPurchaseOrderQuantityGUI{
    public static void main(String[] args){
        String itemName;
        double price;
        int quantity;

        itemName=JOptionPane.showInputDialog("Nombre del articulo comprado: " );
        
        price=Double.parseDouble(JOptionPane.showInputDialog("Precio: "));
        quantity=Integer.parseInt(JOptionPane.showInputDialog("cantidad de articulos: "));
        
        JOptionPane.showMessageDialog(null, "Orden de Compra:\n\nArticulo: "+itemName+"\nPrecio: "+price+"\nCantidad de articulos: "+quantity+"\nTotal a pagar: $ "+(price*quantity));
    }
}
