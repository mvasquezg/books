public class ReplaceSubStrig{
    public static void main(String[] args){
        
        //reemplazar cadenas
        var str="Hola Mundo";

        System.out.println("Cadena Original: "+str);

        //Reemplzar "Mundo" por "a todos"
        var newStr=str.replace("Mundo", "A todos");

        System.out.println("Cadena nueva: "+newStr);

        //Reemplazar "Hola" por "Saludos"
        newStr=str.replace("Hola", "Saludos");

        System.out.println("Cadena nueva: "+newStr);


    }


}