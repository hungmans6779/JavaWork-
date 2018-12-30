<!--JavaScript -->
<%@ page contentType="text/html;charset=Big5" %>
<html>
 <head>
  <title>Ch3_5_6.jsp</title>
 </head>
 <body>
  <%
   int result=1,total=0,i=1;
  do
  {
   out.print("计 :"+i+"<br>");
   result*=i;
   i++;
   if(i>5)
    break;
  }while(true);
  out.print("5!= "+result+"<br>");
  %>
  <hr>
  <%
  for(int j=1;j<=20;j++)
  {
   if(j%2!=0) continue;
   out.print("计: "+j+"<br>");
   total+=j;
  }
  out.print("2+4+....+10案计㎝ = "+total);
  %>
 </body>
</html>