public class OperadorTernario{
    public static void main(String[] args){
        System.out.println("*** Operador ternario ***");

        //Sintaxis
        //condicion ? exp1 : exp2

        //Determinar si un numero es par o no
        var numero=5;

        var resultado=(numero%2==0)?"Par":"Impar";

        System.out.println("El numero "+numero+" es "+resultado);

        //Si es mayor de edad
        var edad=17;
        resultado=(edad>=18)?"Eres Mayor de Edad": "Eres Menor de Edad";

        System.out.println("Tienes "+edad+" años "+resultado);

        //valor negativo, positivo o cero Operador ternario anidado 
        numero=0;
        resultado= (numero>0)?"Positivo":(numero<0)?"Negativo":"Cero";

        System.out.println("El numero "+numero+" es "+resultado);

    }
}