/** 
 *Libro: Introducción al lenguaje de programación Java. Una guía básica.
 *Capitulo 5: Clases en Java
 *Programa 2: Paso por refrencias 
 */
public class Point{
    protected float x; /**@Param x coordenada x del punto */
    protected float y;

    /**
    *Constructor por defecto 
    */
    public Point(){
        x=0.0f;
        y=0.0f;
    }

    /**
    *Constructor con argumentos
    */
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }

    /**
    *Con esta funcion se recupera el valor de la coordenada solicitada
    * @param coordenada la coordenada que se solicita 'x' o 'y'
    * @return el valor de la coordenada
    * @deprecated este funcion eliminara en proximas versiones
    * @see #getX()
    * @see #getY()  
    */
    public float get (String coordenada){
        float result=0;
        if(coordenada.equals("x")){
            result=x;
        }else if(coordenada.equals("y")){
            result=y;
        }

        return result;
    }

    /**
     * Esta funcion devuelve el valor de la cordenada 'x'
     * @return el valor de la coordena 'x'
     */
    public float getX(){
        return x;
    }

    /**
     * esta funcion cambia el valor de la coordenada 'x'
     * @param x el nuevo valor de la coordenada 'x'
     */
    public void setX(float x){
        this.x=x;
    }

    /**
     * Esta funcion devuelve el valor de la cordenada 'y'
     * @return el valor de la coordena 'y'
     */
    public float getY(){
        return y;
    }

    /**
     * esta funcion cambia el valor de la coordenada 'y'
     * @param y el nuevo valor de la coordenada 'y'
     */
    public void setY(float y){
        this.y=y;
    }

    /**
     * Esta funcion devuelve un punto que es el inverso del punto
     * @return Punto el inverso de este punto
     */
    public Point inverso(){
        return new Point(-x, -y);
    }

    /**
     * Sobre escritura de toString()
     * @return String una cadena con la informacion a mostrar
     */
    public String toString(){
        return "("+x+", "+y+")";
    }
}
