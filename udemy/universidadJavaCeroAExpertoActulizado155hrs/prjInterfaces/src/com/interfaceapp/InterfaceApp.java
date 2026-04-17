package prjInterfaces.src.com.interfaceapp;

import prjInterfaces.src.com.interfaceclass.Traductor;
import prjInterfaces.src.com.interfaceclass.InglesClass;
import prjInterfaces.src.com.interfaceclass.FrancesClass;
public class InterfaceApp {
    public static void main(String[] args) {
        Traductor ingles=new InglesClass();
        
        ingles.iniciarTraductor();
        ingles.traducir();
        
        System.out.println();
        Traductor frances=new FrancesClass();
        frances.iniciarTraductor();
        frances.traducir();
    }
}
