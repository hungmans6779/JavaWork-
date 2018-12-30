import java.util.*;
public class GenericsTest4
{
 public static void main(String argv[])
 {
 	Vector<String>v=new Vector<String>();
 	//v以泛型宣告為String型態，所以不能再放其它型態的元素...........
 	//v.add(new Integer(5));
 	v.add("SCJP");
 	v.add("Tiger");
 	v.add("SCJP 5.0");
 	Iterator it=v.iterator();
  for(String o:v)
  {
   String data=o;
   System.out.print(data+"\t");
  } 
 }		
}	