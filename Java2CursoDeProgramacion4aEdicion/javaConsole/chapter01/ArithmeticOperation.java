/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 01: Fases en el desarrollo de un programa
*Programa 02: Operaciones Aritmeticas.    
*/
public class ArithmeticOperation{

    public static void main(String[] args){
        int data1, data2, result;

        data1=20;
        data2=10;

        //sum
        result=data1+data2;
        System.out.println(data1+" + "+data2+" = "+result);

        //rest
        result=data1-data2;
        System.out.println(data1+" - "+data2+" = "+result);

        //multp
        result=data1*data2;
        System.out.println(data1+" * "+data2+" = "+result);

        //div
        result=data1/data2;
        System.out.println(data1+" / "+data2+" = "+result);
    }

}
