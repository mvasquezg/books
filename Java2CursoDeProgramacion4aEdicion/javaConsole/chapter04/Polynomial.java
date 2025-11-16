/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 04: Introducción a la Programacion Orientada a Objetos
*Programa 03: Polinomio ax3+bx+2+cx+d
*/
public class Polynomial{
    double a, b, c, d;

    public void Polynomial(double a, double b, double c, double d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    public double getResult(double x){
        double result=0;

        result= (this.a*Math.pow(x, 3))+(this.b*Math.pow(x, 2))+(this.c*x)+this.d;

        return result;
    } 

}