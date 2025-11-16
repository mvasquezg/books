package polynomial;
public class Polynomial{

    private double a, b, c, d;

    public Polynomial(){
    }

    public void Polynomial(double a, double b, double c, double d){
        setA(a);
        setB(b);
        setC(c);
        setD(d);
    }

    public void setA(double a){
        this.a=a;
    }

    public void setB(double b){
        this.b=b;
    }

    public void setC(double c){
        this.c=c;
    }

    public void setD(double d){
        this.d=d;
    }

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double getC(){
        return this.c;
    }

    public double getD(){
        return this.d;
    }  

    public double getResult(double x){
        double result=0;

        result= (getA()*Math.pow(x, 3))+(getB()*Math.pow(x, 2))+(getC()*x)+getD();

        return result;
    }
}