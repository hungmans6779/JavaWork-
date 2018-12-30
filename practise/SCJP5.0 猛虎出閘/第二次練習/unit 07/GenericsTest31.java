import java.util.*;
public class GenericsTest31
{
 public static void main(String argv[])
 {
  Vector <Integer>v=new Vector<Integer>();
  v.add(100);
  v.add(200);
  v.add(300);
  System.out.println("v的內容為:"+v);
  for(int value:v)
  {
   int data=value;
   System.out.println(data);	
  }	
 }
}