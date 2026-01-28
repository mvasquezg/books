public class CreateEmail{
    public static void main(String[] args){
        var name="Ubaldo Acosta soto";
        
        var lastSpace=name.lastIndexOf(" ");
        var middleName=name.substring(lastSpace);

        var replaceName=name.replace(middleName, "");
        lastSpace=replaceName.lastIndexOf(" ");

        System.out.println("*** Generador de Email ***"); 
        System.out.println("\nNombre Usuario: "+name);

        var lastName=replaceName.substring(lastSpace);
        

        replaceName=replaceName.replace(lastName, "");
        name=replaceName;
        var normalName=String.join(".",name.strip().toLowerCase(),lastName.strip().toLowerCase(),middleName.strip());

        System.out.println("Nombre Usuario normalizado: "+normalName);
        
        var companyName="Global Mentory";
        
         System.out.println("\nNombre de la emprea: "+companyName);

        companyName=companyName.replace(" ", "");

        
        var extensionDomain=".com.mx";
        
        var normalExtensionDomain="@"+companyName.toLowerCase()+extensionDomain;

        var email=normalName+normalExtensionDomain;

       
        
        
        
       
        System.out.println("Extension del dominio: "+extensionDomain);
        System.out.println("Dominio de emmail normalizado: "+normalExtensionDomain);
        System.out.println("\n\nEmail final generado: "+email);         
    }
}