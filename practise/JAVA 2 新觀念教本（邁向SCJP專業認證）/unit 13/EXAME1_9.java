import java.util.*;
public class EXAME1_9
{
 public static void main(String argv[])
 {
  String []k={"��","��","��","��","�s","��"};
  String []v={"��","��","�G","�f","��","�l"};
  HashMap<String,String>map=new HashMap<String,String>();
  for(int i=0;i<k.length;i++)
  {
   map.put(k[i],v[i]);	
  }	
  System.out.println(map.get(k[0]));
 }
}