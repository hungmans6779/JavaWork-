import java.util.*;
public class GenericsTest6
{
 public static void main(String argv[])
 {
  Vector<String>v=new Vector();
  //v�w�g�ŧi���x��String���A�A�ҥH����A�[�J�䥦���A�������F......
  //v.add(new Integer(3));
  v.add("JAVA");
  v.add("SCJP");
  for(String data:v)
  {
   System.out.print(data+"\t");	
  }	
 }
}