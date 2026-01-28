public class SearchString{
    public static void main(String[] args){

        //Buscar subcadenas con el metodo indexOf (devuelve el indice de la primera aparicion de la subcadena)
        var str1="khasdkjbask Mundo askasdhlkashd Hola Munod asbdkas  Mundo";

        System.out.println("Cadena original: "+str1);

        //Subcadena a buscar "Hola"
        var indexFirstSubString=str1.indexOf("Hola");

        System.out.println("Indice 1: "+indexFirstSubString);

        //Uso del --Metodo lastIndexOf() --Devuelve el indice de la ultima aparicion de la subcadena
        var indexSecondSubString=str1.lastIndexOf("Mundo");

        System.out.println("Indice 2: "+indexSecondSubString);

        //Subcadena no encontrada devuelve -1

        var indexThirdSubString=str1.lastIndexOf("Java");
        System.out.println("Indice 3: "+indexThirdSubString);

         var indexfourthSubString=str1.indexOf("Java");
        System.out.println("Indice 4: "+indexfourthSubString);

    }
}