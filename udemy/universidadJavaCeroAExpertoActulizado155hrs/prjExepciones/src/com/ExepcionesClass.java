package prjExepciones.src.com;

public class ExepcionesClass {
    public static void main(String[] args) {
        int num1=10;    
        int num2=0;

        try {
            var resultado=num1/num2; // Esto genera una excepción de tipo ArithmeticException, ya que no se puede dividir por cero.
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
