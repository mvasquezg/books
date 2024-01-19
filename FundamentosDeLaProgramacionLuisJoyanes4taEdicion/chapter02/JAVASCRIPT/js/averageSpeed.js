function calculate(){
    let min=0;      //minutos
    let sec=0;      //segundos
    let sumSec=0;   //sumaSegundos
    let sumMin=0;   //sumaMinutos
    let count=0;    //Contador
    let average=0;  //promedio
    let minsToSeconds=0; //Minitos convertidos a segundos
    let totalSeconds=0;  //Total de segunsos
    let m=0;            //Minutos
    let s=0;            //Segundos
    let paragrafh=document.createElement("p");
    paragrafh.setAttribute("id", "idParagrafh");

    if(document.getElementById("idBtnCalculate").value=="Calcular"){
        
        do{
            min=parseInt(prompt("Captura el tiempo de los corredores (minutos, segundos).\nPara terminar la captura ingresa (0,0).\n\ningresa minutos: "));
            sec=parseInt(prompt("Captura el tiempo de los corredores (minutos, segundos).\nPara terminar la captura ingresa (0,0).\n\ningresa segundos: "));
                
            if(min>0){
                sumMin+=min;
                sumSec+=sec;
    
                count++;
            }
        }while(min>0);
    
        minsToSeconds=sumMin*60;
        totalSeconds=minsToSeconds+sumSec;
    
        average=totalSeconds/count;
    
        m=parseInt(average/60);
        s=parseInt(average%60);

        paragrafh.innerHTML="<p></p>Promedio de Minutos y segundps alcanzado<p></p>Minuto: "+m+"<p></p>Segundos: "+s;
        document.getElementById("idSection").appendChild(paragrafh);
        document.getElementById("idBtnCalculate").value="Limpiar";  
    }else{
        document.getElementById("idParagrafh").remove();
        document.getElementById("idBtnCalculate").value="Calcular";
    }
}
