public class SubString{
    public static void main(String[] args){
        //Tema subcadenas
        var str1="Hola Mundo";
        System.out.println("Cadena original: "+str1);

        //Primera subcadena --Metodo substring(Indice de inicio, indice final sin incluirlo)
        var subStr1=str1.substring(0, 4);
        System.out.println("Subcadena 1: "+subStr1);

         //Segunda subcadena --Metodo substring(Indice de inicio) se crea desde indice dado hasta el ultimo
        var subStr2=str1.substring(5, 10);
        System.out.println("Subcadena 2 indicacando indice de inicio e indice finalcode: "+subStr2);
        var subStr3=str1.substring(5);
        System.out.println("Subcadena 2 solo con el indice de inicio: "+subStr3);

    }
}