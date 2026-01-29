public class OperadorUnario{
    public static void main(String[] args){
        System.out.println("*** Operadores Unarios ***");
        int a=3, b=-2, resultado;

        //Operador unario +
        resultado=+a;

        System.out.println("Resultado +a = "+resultado);

        //Operador unario -
        resultado=-a;

        System.out.println("Resultado -a = "+resultado);

        //Operadores unarios incremento/decremento
        //Pre-incremento
        a=3;
        
        resultado=++a; //Preimero se incrementa  el valor

        System.out.println("Resultado ++a = "+resultado);

        System.out.println("a ya se incremento = "+resultado);

        
        //Post-incremento
        a=3;
        
        resultado=a++; //Primero se usa el valor y despues de incrementa

        System.out.println("\nResultado a++ = "+resultado);

        System.out.println("a en este momento se incrementa = "+a);

        //Pre-decremento
        b=-2;
        
        resultado=--b; //Primero se decrementa  el valor

        System.out.println("\nResultado --b = "+resultado);

        System.out.println("b ya se decremento = "+b);

        
        //Post-incremento
        b=-2;
        
        resultado=b--; //Primero se usa el valor y despues de incrementa

        System.out.println("\nResultado b-- = "+resultado);

         System.out.println("b en este momento se incrementa = "+b);



    }

}