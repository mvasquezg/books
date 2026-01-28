public class CompareStgring{

    public static void main(String[] args){
        //Comparacion de cadenas (pool de cadenas)
        var str1="Java";
        var str2="Java";            
        
        //Comparacion de cadenas (==) compara la refrencia en memoria
        System.out.println("Cadena 1 es igual en refrencia a la cadena 2: "+(str1==str2));

        
        var str3=new String("Java");            
        
        //Comparacion de cadena1 con cadena 3 (refrencia)
        System.out.println("Cadena 1 es igual en refrencia a cadena 3: "+(str1==str3));

        //Comparar contenido entre cadenas se usa el metodo equals.
        System.out.println("Cadena 1 es igual en contenido a cadena 3: "+(str1.equals(str3)));
    }
}