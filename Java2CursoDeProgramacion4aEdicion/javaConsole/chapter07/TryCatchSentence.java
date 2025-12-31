/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 12: Uso de la sentencia Try Catch. 
*/
public class TryCatchSentence{
    public static void main(String[] args){
        int data1=0, data2=0, data3=0;
        
        /*System.out.println("Se inicia la aplicacion: ");
        data1++;

        data3=data1/data2;

        data2++;

        System.out.println(data1+" "+data2+" "+data3);
        */
    
        System.out.println("Se inicia la aplicacion: ");
        try{
            data1++;

            data3=data1/data2;

            data2++;

        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
            data3=data1;
        } 

        System.out.println(data1+" "+data2+" "+data3);

    }
}