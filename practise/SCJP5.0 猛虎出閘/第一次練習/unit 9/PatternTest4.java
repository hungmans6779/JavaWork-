import java.util.regex.*;
public class PatternTest4
{
 public static void main(String argv[])
 {
  String [] token1,token2,token3;
  Pattern pn=Pattern.compile("[:/.]+");
  token1=pn.split("http://vincentjava.idv.tw");
  for(String token:token1)
  {
   System.out.println(token);
  }
  System.out.println("=============================");
  token2=pn.split("http://vincentjava.idv.tw",2);
  for(String token:token2)
  {
   System.out.println(token);
  }
  System.out.println("==============================");
  token3=pn.split("http://vincentjava.idv.tw",100);
  for(String token:token3)
  {
   System.out.println(token);
  }
 }
}