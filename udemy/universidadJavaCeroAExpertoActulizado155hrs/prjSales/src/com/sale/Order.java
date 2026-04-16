package prjSales.src.com.sale;

public class Order {
    
    private final int idOrder;
    private Product[] aarrayProduct;
    private int countProducts;
    private static int countOrders;
    private static final int MAX_PRODUCTS = 10; 

    public Order() {
        this.idOrder = ++Order.countOrders;
        this.aarrayProduct = new Product[Order.MAX_PRODUCTS];
    }
     
    public void addProduct(Product product) {
        
        if (this.countProducts < Order.MAX_PRODUCTS) {
            this.aarrayProduct[this.countProducts++] = product;
        } else {
            System.out.println("Se ha superado el máximo de productos permitidos en la orden. "+MAX_PRODUCTS+" máximo permitido.");
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < this.countProducts; i++) {
            total += this.aarrayProduct[i].getPriceProduct();
        }
        return total;
    }

    /*public void showOrder() {
        System.out.println("Orden Id: " + this.idOrder);
        System.out.println("\tProductos en la orden:");
        for (int i = 0; i < this.countProducts; i++) {
            System.out.println(this.aarrayProduct[i]);
        }
        System.out.println("\t\tTotal de la orden: $" + this.calculateTotal());
    }*/

    @Override
    public String toString() {
        var result="MOstrado por el metdo toString -\n Orden Id: " + this.idOrder;
        
        result += "\n\tProductos en la orden:\n";

        for (int i = 0; i < this.countProducts; i++) {
            result+=this.aarrayProduct[i]+"\n";
        }
        result+="\t\tTotal de la orden: $" + this.calculateTotal();
        return result;
    }
}

