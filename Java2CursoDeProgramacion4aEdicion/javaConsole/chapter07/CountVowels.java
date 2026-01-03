/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 13: Programa que lee un texto y de como resultado el numero de palabras con al menos 4 vocales diferentes. 
*/
import java.io.IOException;

public class CountVowels{
    public static void main(String[] args){
        
        int np=0; //Numero de palabras
        
        int a=0, e=0, i=0, o=0, u=0;

        char car;

        final char eof=(char)-1;

        try{

            System.out.print("Introducir texto.\nPara finalizar pulsar Ctrl+z en windows o Ctrl+D en linux: \n");

            while( (car=(char) System.in.read()) !=eof){
                switch(car){
                    case 'A': case 'a': case 'á':
                        a=1;
                        break;
                    case 'E': case 'e': case 'é':
                        e=1;
                        break;
                    case 'I': case 'i': case 'í':
                        i=1;
                        break;        
                    case 'O': case 'o': case 'ó':
                        o=1;
                        break;
                    case 'U': case 'u': case 'ú':
                        u=1;
                        break;
                    default:
                        if(car == ' '){
                            if((a+e+i+o+u) >= 4) np++;
                            a=e=i=o=u=0;
                        }//end if

                        if(car == '\n'){
                            if((a+e+i+o+u) >= 4) np++;
                            a=e=i=o=u=0;
                        }//end if
                }//end switch
            }//end while    

            
            if((a+e+i+o+u) >= 4){
                np++;
            }
            
            System.out.println("\n\nNumero de palabras con 4 vocales distintas: "+np);
        }catch(IOException ignorada){

        }


    }
}