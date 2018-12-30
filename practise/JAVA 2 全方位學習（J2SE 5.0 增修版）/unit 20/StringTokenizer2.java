import java.util.*;
public class StringTokenizer2
{
 public static void main(String argv[])
 {
  StringTokenizer st=new StringTokenizer("AFBFCFDFEF","F",true);
  while(st.hasMoreTokens())
  {
   System.out.println(st.nextToken());
  }
 }
}