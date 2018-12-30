public class hTest38
{
 static String str="A0001:34&A0002:67&A0003:454&B2345:45";	
 
 public static void main(String argv[])
 {
  System.out.println(getBookID());
  System.out.println(getQty("A0003"));
  System.out.println(changeQty("A0003",23));	
 }		
 
 public static String getBookID()
 {
 	int start=0,end=0;
 	end=str.indexOf(":");
 	String book="";
 	while(end!=-1)
 	{
 	 book+="'"+str.substring(start,end)+"',";
 	 end=str.indexOf(":",end+1);
 	 start=str.indexOf("&",start+1)+1; 	
 	}	
 	return book.substring(0,book.lastIndexOf(","));
 }
 
 public static String getQty(String bookID)
 {
 	int index=str.indexOf(bookID);
 	int start=0;
 	int end=0;
 	if(index!=-1)
 	{
 	 start=str.indexOf(":",index)+1;
 	 end=str.indexOf("&",index);	
 	}	
 	return str.substring(start,end);
 }
 
 
 public static String changeQty(String bookID,int qty)
 {
 	int index=str.indexOf(bookID);
 	int start=0;
 	int end=0;
 	if(index!=-1)
 	{
 	 start=str.indexOf(":",index)+1;
 	 end=str.indexOf("&",index);
 	} 
 	
 	return str.substring(0,start)+qty+str.substring(end);
 }
 			
}	