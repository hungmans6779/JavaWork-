public class hTest37
{
 static String str="a1212:23&b1232:34&d4334:33&";
 	                //012345678901234567890123456	
 public static void main(String argv[])
 {
 	 System.out.println(qty("b1232"));
 	 System.out.println(getBook());	
 }		
 public static String qty(String data)
 {
 	int start=str.indexOf(data);
 	if(start!=-1)
 	{
 	 start=str.indexOf(":",start);
 	 int end=str.indexOf("&",start);
 	 return str.substring(start+1,end);
 	}	
 	 return "";
 }
 
 
 public static String getBook()	
 {
 	int end=0,start=0;
 	String str1="",str2="";
 	end=str.indexOf(":");
 	while(end!=-1)
 	{
 	 str1+="'"+str.substring(start,end)+"',";
 	 end=str.indexOf(":",end+1);
 	 start=str.indexOf("&",start+1)+1; 	
  }		
  return str1.substring(0,str1.lastIndexOf(","));
 }	
}	