import java.util.*;
public class GenericsTest14
{
 public static void main(String argv[])
 {
  Vector<String>v=new GenericsTest14().getMyVector();
  for(String data:v)
  {
   String value=data;
   System.out.print(value+"\t");
   //System.out.print(data+"\t");	
  }	
 }
  Vector<String>getMyVector()
 {
  Vector<String>k=new Vector<String>();
  v.add("Tiger");
  v.add("JAVA");
  v.add("SCJP");
  return k;	
 }
}