/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 02: Clase Computadora
*/
public class Computer{
    private String trademark;
    private String processor;
    private int weight;
    private boolean on=false;
    private boolean screen=false;

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
    public void onComputer(){
        if(on){
            System.out.println("La computadora esta encendida.");
        }else{
            setOn(true);
            setScreen(true);
            System.out.print("La computadora ha sido encendida");
        }
    }

    public void statusComputer(){
        System.out.println("\nEl estado de la computadora es el siguiente:\n");
        System.out.println("Marca: "+getTrademark());
        System.out.println("Procesador: "+getProcessor());
        System.out.println("Peso: "+getWeight());
    
        if(this.on){
            System.out.println("La computadora esta encendida.");
        }else{
            System.out.println("La computadora esta apagada.");
        }

        if(this.screen){
            System.out.print("La pantalla esta activa.");
        }else{
            System.out.print("La pantalla esta inactiva.");
        }
        System.out.println("\n");
    }

    public void offComputer(){
        System.out.println("Apagando");
        for(int i=1; i<=5; i++){
            System.out.print(".");
        }
        setScreen(false);
        setOn(false);
    }

    public void runComputer(){

        if(!this.screen){
            System.out.println("Se activa la pantalla");
        }

        System.out.println("La computadora esta encendida");
    }

}