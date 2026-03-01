public class OperadorOr{
    public static void main(String[] args){
        
        System.out.println("*** Operador Or ***");

        boolean a=false, b=true;
        
        //0r (regresa true si cualquiera de los valores es true)
        var result=a||b;

        System.out.println("Resultado: "+result);
    }
}