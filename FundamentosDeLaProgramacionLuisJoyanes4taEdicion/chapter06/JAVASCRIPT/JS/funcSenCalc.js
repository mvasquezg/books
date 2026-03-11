/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 07.-Supuesto que nuestro compilador tiene la funcion. Podriamos calcular el seno de x mediante la siguiente serie:

    sen(x)= x - (x^3/3!) + (x^5/5!) + (x^7/7!) + ...(hasta 17 terminos)   
    
    Ejemplo 8
    Pagina 208-209
*/

function showFactorial(x){
    if(x<=1){
        return 1;
    }else{
        return x*showFactorial(x-1);
    }   
}

function  power(x, expo){
        var result=1;
        for(var i=1; i<=expo; i++){
            result*=x;
        }

        return result;
}

function  sen(x){
    var X, s;
    var n=0;

    X=x*3.141592/180;
    s=X;

    for(var i=2; i<=17; i++){
        n=2*i-1;

        if(i%2!=0){
            s=s-(power(X, n)/showFactorial(n));
        }else{
            s=s+(power(X, n)/showFactorial(n));
        }
    }
        return s;
}

function cleanPage(){
    document.getElementById("idResult").value="";
    document.getElementById("idBtnCalculate").value="Limpiar";
    
}

function calculate(){
    var x=0.0;
    var varSpan=document.createElement("span");
        varSpan.setAttribute("id", "idSpan");

    if(document.getElementById("idBtnCalculate").value=="Calcular"){
        x=parseFloat(document.getElementById("idAngle").value);

        varSpan.innerHTML="<br>sen(x) = "+sen(x)+"<br><br>";
        document.getElementById("idResult").append(varSpan);
        document.getElementById("idBtnCalculate").value="Limpiar";
    }else{
        cleanPage();
    }  
}

function cleanPage(){
    document.getElementById("idAngle").value="";
    document.getElementById("idSpan").remove();
    document.getElementById("idBtnCalculate").value="Calcular";
}