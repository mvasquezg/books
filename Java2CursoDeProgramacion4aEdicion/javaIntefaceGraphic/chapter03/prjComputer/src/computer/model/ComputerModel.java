/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 02: Clase Computadora
*/
package computer.model;

public class ComputerModel{
    private String trademark;
    private String processor;
    private int weight;
    private boolean on=false;
    private boolean screen=false;

    public ComputerModel(){
        
    }


    //Methods Set
    public void setTrademark(String trademark){
        this.trademark=trademark;
    }

    public void setProcessor(String processor){
        this.processor=processor;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    public void setOn(boolean on){
            this.on=on;
    }


    public void setScreen(boolean screen){
        this.screen=screen;
    }

    //Methods get   
    public String getTrademark(){
        return this.trademark;
    }

    public String getProcessor(){
       return this.processor;
    }

    public int getWeight(){
        return this.weight;
    }

    public boolean getOn(){
        return this.on;
    }


    public boolean setScreen(){
        return this.screen;
    }

    //Others methods
    public String onComputer(){
        String onComputer="";

        if(on){
            onComputer="La computadora esta encendida.";
        }else{
            setOn(true);
            setScreen(true);
            onComputer="La computadora ha sido encendida";
        }
        return onComputer;
    }

    public String statusComputer(){
        String estatus="";
        estatus+="<br>El estado de la computadora es el siguiente:<br>";
        estatus+="<br>Marca: "+getTrademark();
        estatus+="<br>Procesador: "+getProcessor();
        estatus+="<br>Peso: "+getWeight();
    
        if(this.on){
            estatus+="<br>La computadora esta encendida.";
        }else{
            estatus+="<br>La computadora esta apagada.";
        }

        if(this.screen){
            estatus+="<br>La pantalla esta activa.";
        }else{
            estatus+="<br>La pantalla esta inactiva.";
        }
        estatus+="<br>";
        return estatus;
    }

    public String offComputer(){
        String ofComputer="";
        ofComputer+="Apagando";
        for(int i=1; i<=5; i++){
            ofComputer+=".";
        }
        setScreen(false);
        setOn(false);
        return ofComputer;
    }

    public void runComputer(){
    
        if(!this.screen){
            System.out.println("Se activa la pantalla");
        }

        System.out.println("La ");
    }

}