import java.util.*;
public class GenericsTest4
{
 public static void main(String argv[])
 {
 	Vector<String>v=new Vector<String>();
 	//v�H�x���ŧi��String���A�A�ҥH����A��䥦���A������...........
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