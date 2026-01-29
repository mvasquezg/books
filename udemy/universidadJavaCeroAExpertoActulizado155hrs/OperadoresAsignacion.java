public class OperadoresAsignacion{
    public static void main(String[] args){
        System.out.println("***  Operadores de Asigancion **");

        //Asignacion Simple
        var miNumero=10;
        int miNumero2;
        miNumero2=15;
        System.out.println("miNumero valor incial = "+miNumero);

        //Operadores de asignacion compuesto
        //+=
        miNumero+=5;
        System.out.println("miNumero +=5 = "+miNumero);

        //*=
        miNumero*=2;
        System.out.println("miNumero *=2 = "+miNumero);

        int a=10, b=15, c=20;
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
    }
}