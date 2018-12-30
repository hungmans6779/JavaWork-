import java.util.*;
public class GenericsPolymorphismTest1
{
 public static void main(String argv[])
 {
  Vector<String>v=new Vector<String>();
  List<String>v1=v;
  v.add("Tiger");
  v.add("JAVA");
  v.add("SCJP");
  v1.add("MCSE");
  v1.add("MCSD");
  for(String data:v)
  {
   System.out.print(data+"\t");	
  }	
  System.out.println();
  for(String data:v1)
  {
   System.out.print(data+"\t");	
  }	
 }
}