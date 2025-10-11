/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 01: Fases en el desarrollo de un programa
*Programa 03: Operaciones Aritmeticas con tres datos, sumar, restar, multiplicar y dividir.    
*/
public class ArithmeticOperationWithThreeValue{

    public static void main(String[] args){
        int data1, data2, data3, result;

        data1=20;
        data2=10;
        data3=5;

        //sum
        result=data1+data2+data3;
        System.out.println(data1+" + "+data2+" + "+data3+" = "+result);

        //rest
        result=data1-data2-data3;
        System.out.println(data1+" - "+data2+" - "+data3+" = "+result);

        //multp
        result=data1*data2*data3;
        System.out.println(data1+" * "+data2+" * "+data3+" = "+result);

        //div
        result=data1/data2;
        System.out.println(data1+" / "+data2+" / "+data3+" = "+result);
    }

}
