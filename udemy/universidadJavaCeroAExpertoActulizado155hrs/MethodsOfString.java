public class MethodsOfString{
    public static void main(String[] args){
        var str1="Hola Mundo"; 

        System.out.println("Cadena original: "+str1);

        //Obtner el largo de una cadena --Metodo: length()--
        var length=str1.length();

        System.out.println("Longitud: "+length);

        //Reemplazar caracteres --Metodo: replace();
        var newStr=str1.replace('o', 'a');

        System.out.println("Nueva Cadena: "+newStr);

        //Convertir a mayusculas --Metodo toUpperCase(); 
        var mayus=str1.toUpperCase();

        System.out.println("Cadena en mayusculas: "+mayus);

        //Convertir a minusculas --Metodo toLowerCase(); 
        //var minus=str1.toLowerCase();
        //System.out.println("Cadena en minusculas: "+minus);
        System.out.println("Cadena en minusculas directo: "+str1.toLowerCase());


        //Eliminar espacio al inciio y al final de una cadena --Metodo trim();
        var str2="   nombre de persona     ";
        System.out.println("Cadena con espacios en blanco: *"+str2);
        System.out.println("Cadena quitando espacios en blanco: *"+str2.trim());
        



    }
}