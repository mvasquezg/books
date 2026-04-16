package prjSales.src.com.sale;

public class Product {
    private final int idProduct;

    private String nameProduct;
    private double priceProduct;
    private static int countProducts;

    public Product(String nameProduct, double priceProduct) {
        this.idProduct = ++Product.countProducts; 
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public int getIdProduct() {
        return this.idProduct;
    }

    public String getNameProduct() {
        return this.nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    
    public double getPriceProduct() {
        return priceProduct;
    }    

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override  
    public String toString() {
        return "\t\tProducto {IdProducto=" + this.idProduct + ", Nombre=" + this.nameProduct + ", Precio=" + this.priceProduct + "}";
    }
}
