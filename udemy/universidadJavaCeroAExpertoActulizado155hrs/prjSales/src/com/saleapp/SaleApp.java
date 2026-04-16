package prjSales.src.com.saleapp;

import prjSales.src.com.sale.Product;
import prjSales.src.com.sale.Order;

public class SaleApp {
    public static void main(String[] args) {
        System.out.println("*** Sistemas de Ventas ***");
        var product1 = new Product("Laptop", 1200.00);
        //System.out.println(product1);
        var product2 = new Product("Smartphone", 800.00);
        //System.out.println(product2);

        //Primera orden de compra
        var order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);    
        //order1.showOrder();
        System.out.println(order1);
        System.err.println();
        //Orden de compra 2
        var order2 = new Order();
        order2.addProduct(new Product("Tablet", 500.00));
        order2.addProduct(product1);
        order2.addProduct(product2);
        //order2.showOrder();
        System.out.println(order2);
    }
}
