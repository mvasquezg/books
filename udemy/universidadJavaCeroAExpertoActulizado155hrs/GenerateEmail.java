public class GenerateEmail{
    public static void main(String[] args){
        System.out.println("*** Generador de Mails ***");

        //Nombre completo del usuario
        var name=" Ubaldo Acosta Soto";
        System.out.println("Nombre completo: "+name);

        //Procesar o normalizar el nombre
        //Limpiar espacios en blanco
        var normalName=name.strip();        

        //Reemplazar espacios en blanco por puntos
        normalName=normalName.replace(" ", ".");

        //Convertir la cadena a minusculas
        normalName=normalName.toLowerCase();

        System.out.println("Nombre normalizado: "+normalName);

        //Datos de la empresa
        var companyName=" Global Mentoring ";
        System.out.println("\nNombre empresa: "+companyName);

        var extensionDomain=".com.mx";
        System.out.println("Extension del dominio: "+extensionDomain);
        
        //Quitamos los espacios en blanco y convertimos a minusculas
        var normalCompanyName=companyName.strip().replace(" ", ".").toLowerCase();

        var normalExtensionDomain="@"+normalCompanyName+extensionDomain;
        var email=normalName+normalExtensionDomain;
        System.out.println("Email= "+email);
    }
}