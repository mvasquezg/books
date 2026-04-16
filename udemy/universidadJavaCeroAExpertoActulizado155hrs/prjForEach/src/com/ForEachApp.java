package prjForEach.src.com;

public class ForEachApp {
    public static void main(String[] args) {
        int arrayAge[] = {25, 30, 35, 40, 45};

        System.out.println("*** uso for each ***");
        for (int i : arrayAge) {
               System.out.println("Edad: "+i); 
        }
    }
}
