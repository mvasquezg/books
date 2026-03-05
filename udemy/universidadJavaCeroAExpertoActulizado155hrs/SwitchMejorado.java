public class SwitchMejorado{
    public static void main(String[] args){
        var day=10;

        System.out.println("*** Dia de la Semana con Switch");

        var dayStr = switch(day){
            case 1->"Lunes";
            case 2->"Martes";
            case 3->"Miercoles";
            case 4->"Jueves";
            case 5->"Viernes";
            case 6->"Sabado";
            case 7->"Domingo";
            default->"Desconocido";                      
        };
        System.out.println("El dia "+day+" es "+dayStr);
    }
}