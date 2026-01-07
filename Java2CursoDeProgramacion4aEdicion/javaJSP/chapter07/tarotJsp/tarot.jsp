<html>
    <head>
        <title>Numero del tarot</title>
    </head>
    <body>
        <%!
            public int showTarotNumber(int sum){
                int d=0, m=0, y=0;   

                if(sum>=10){
                    y=sum/1000;
                    sum=sum%1000;

                    m=sum/100;
                    sum=sum%100;

                    d=sum/10;
                    sum=sum%10;

                    sum=showTarotNumber(sum+y+d+m);
                }

                return sum;
            }
            
   
        %>
        
        
        <%  
            
            int num=0, sum=0, year=0, month=0, day=0;
            year=Integer.parseInt(request.getParameter("nYear"));
            
            month=Integer.parseInt(request.getParameter("nMonth"));
            
            day=Integer.parseInt(request.getParameter("nDay"));
            
            sum=day+month+year;
            num=showTarotNumber(sum);

            out.print("<br>Tu numero de tarot es: "+num+"<br>");
        %>    
            
            
        
    
    </body>
</html>