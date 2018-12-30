import java.util.*;
public class FormatterTest2
{
 public static void main(String argv[])
 {
  StringBuffer sb=new StringBuffer("¶ê©P");
  Formatter f=new Formatter(sb);
  f.format("²v=%f",Math.PI);
  System.out.println(sb);
 }
}