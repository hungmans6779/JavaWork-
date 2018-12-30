import java.util.*;
public class StringTokenizer1
{
 public static void main(String argv[])
 {
  StringTokenizer st=new StringTokenizer(argv[0]);
  while(st.hasMoreTokens())
  {
   System.out.println(st.nextToken());
  }
 }
}