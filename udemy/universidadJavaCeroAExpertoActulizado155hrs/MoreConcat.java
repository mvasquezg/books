public class MoreConcat{
    public static void main(String[] args){

        var str1="Hola";
        var str2="Mundo";

        //Concantenado con el signo mas (+)
        var str3=str1+" "+str2;
        System.out.println("Cadenas concatenadas con simbolo (+): "+str3);

        //Concantenado con el metodo concat
        str3=str1.concat(" ").concat("Mundo");
        System.out.println("Cadenas concatenadas con el metodo concat: "+str3);

        //StringBuilder
        var constructString=new StringBuilder();
        constructString.append(str1);
        constructString.append(" ");
        constructString.append(str2);

        var result=constructString.toString();
        System.out.println("Cadenas concatenadas a partir de un objeto StringBuilder: "+result);

        //StringBuffer -cuando se trabaja con hilos
        var stringBuffer=new StringBuffer();
        stringBuffer.append(str1).append(" ").append(str2);        
        result=stringBuffer.toString();
        System.out.println("Cadenas concatenadas a partir de un objeto StringBuffer: "+result);

        //join
        result=String.join(" ", str1, str2);
        System.out.println("Cadenas concatenadas con el metodo join: "+result);

    }

}