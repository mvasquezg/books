public class InmutabilidadCadenas{
    public static void main(String[] args){
        //Inmutabilidad de cadenas
        var str1="Hola";
        
        System.out.println("Cadena 1 original: "+str1);

        //Para no peder el valode de la cadena 1
        var str2=str1;

        str1="Adios";


        System.out.println("Cadena 1 modificada: "+str1);

        System.out.println("Cadena 2: "+str2);




    }
}    