/** 
 *Libro: Introducción al lenguaje de programación Java. Una guía básica.
 *Capitulo 4: Estructuras de control en Java
 *Programa 1: bucle for y uso de la setencia break
 */
public class Break{
    public static void main(String[] args){
        for(int i=0; i<=10; i++){
            for(int j=0; j<=10; j++){
                if(j>i){
                    break;
                }
                System.out.print(j+", ");                
            }
            System.out.println();
        }
    }
}

/*
public class Break {
    public static void main(String [] args) {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if(j > i) break;
                System.out.print(j+",");
            }
            System.out.println("");
    }
}
}*/