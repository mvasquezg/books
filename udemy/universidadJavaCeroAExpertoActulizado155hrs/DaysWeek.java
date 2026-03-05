public class DaysWeek{

    public static void main(String[] args){
        var day=4;
        var dayStr="";

        System.out.println("*** Dia de la Semana con Switch");

        switch(day){
            case 1:
                dayStr="Lunes";
                break;
            case 2:
                dayStr="Martes";
                break;
            case 3:
                dayStr="Miercoles";
                break;
            case 4:
                dayStr="Jueves";
                break;
            case 5:
                dayStr="Viernes";
                break;
            case 6:
                dayStr="Sabado";
                break;
            case 7:
                dayStr="Domingo";
                break;         
            default:
                dayStr="Desconocido";
                break;                      
        }

        System.out.println("El dia "+day+" es "+dayStr);
    }
}