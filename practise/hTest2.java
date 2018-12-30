import java.util.*;
public class hTest2
{
 public static void main(String argv[])
 {
 	StringTokenizer st=new StringTokenizer("192.168.1.3",".");
 	while(st.hasMoreTokens())
 	{
 	 System.out.println(Integer.toBinaryString(Integer.parseInt(st.nextToken())));	
 	}	
 }		
}	