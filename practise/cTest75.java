import java.util.*;
public class cTest75
{
 public static void main(String argv[])
 {
  String data="自由人:2,小宏:3,1978/07/09:5";
  StringTokenizer st=new StringTokenizer(data,",");
  while(st.hasMoreTokens())
  {
   System.out.println(st.nextToken()+"\t");	
  }	
 }
}