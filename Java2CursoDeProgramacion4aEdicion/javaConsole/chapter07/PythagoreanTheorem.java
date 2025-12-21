/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 07: Bucle anidado While, teorema de pitagoras. 
*/

public class PythagoreanTheorem{
    public static void main(String[] args){
        int x=1, y=1, z=0;

        System.out.println("Z\tX\tY");
        System.out.println("--------------------------------");
        
        while(x<=50){
            
            //Calcular Z. Como Z es un entero, almacena la parte entera
            //de la raiz cuadrada
            z=(int) Math.sqrt(x*x + y*y);

            while(y<=50 && z<=50){
               //Si la raiz cuadrada  anterior fue exacta, escribir x, y ,z
               if(z*z == x*x + y*y){
                System.out.println(z+"\t"+x+"\t"+y);
               }

               y+=1;
               z=(int) Math.sqrt(x*x+y*y);

            }//end y,z while 

            x+=1;
            y=x;

        }//end x while
    }
}