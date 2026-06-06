package prjSnacks.src.com.snacks.bean;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int snackCount = 0;
    private int idSnack;
    private String name;
    private double price;

    public Snack() {
        this.idSnack = ++Snack.snackCount;
    }

    public Snack(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public int getIdSnack() {
        return idSnack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static int getSnackCount() {
        return snackCount;
    }

    public String toString() {
        return "Snack [idSnack=" + idSnack + ", Nombre=" + name + ", Precio=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Snack snack = (Snack) obj;
        return idSnack == snack.idSnack && Double.compare(snack.price, price) == 0 && name.equals(snack.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, name, price);
    }
}   
