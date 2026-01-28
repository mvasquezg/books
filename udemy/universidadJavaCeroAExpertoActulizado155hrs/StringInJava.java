public class StringInJava{
    public static void main(String[] args){
        System.out.println("*** Manejo de cadenas ***");

        var str1="Hola";
        System.out.println(str1);    

        var str2=new String("Mundo");
        System.out.println(str2);

        var str3=str1+" "+str2;
        System.out.println(str3);    

        var str4="""
            Este es 
            un texto
            multilinea
        """;
        System.out.print(str4);    


    }
}