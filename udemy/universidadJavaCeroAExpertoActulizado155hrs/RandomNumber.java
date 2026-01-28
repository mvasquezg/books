import java.util.Random;

public class RandomNumber{
    public static void main(String[] args){
        //Se crea el objeto random
        var random=new Random();
       
        System.out.println("*** Numeros aleatorios ***");
        
        //Numero aleatorio entre 0y 9
        var numRandom=random.nextInt(10);
        System.out.println("Numero Aleatorio entre 0 y 9: "+numRandom);

        //Numero aleatorio entre 0y 9
        numRandom=random.nextInt(10)+1;
        System.out.println("Numero Aleatorio entre 1 y 10: "+numRandom);

        //Numero aleatorio entre flotante entre 0.0 y 1.0
        var floatNumRandom=random.nextFloat();
        System.out.println("Numero Aleatorio flotante entre 0.0 y 1.0: "+floatNumRandom);


        //Simular el lanzamiento de un dado
        var dado=random.nextInt(6)+1;
        System.out.println("Resultado de lanzar el dado: "+dado);

    }   
}