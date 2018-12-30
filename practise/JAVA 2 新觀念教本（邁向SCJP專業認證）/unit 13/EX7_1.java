import java.util.*;
public class EX7_1
{
 public static void main(String argv[])
 {
  String k[]={"°¨","ªê","ª¯","¤û","Å[","¿ß","¿ß"};
  int v[]={20,20,30,40,50,60,70};
  Map<String,Integer> map=new HashMap<String,Integer>();
  for(int i=0;i<k.length;i++)
  {
   map.put(k[i],v[i]);	
  }	
  Set<String>keys=map.keySet();
  System.out.println(keys);
  for(String key:keys)
  {
   System.out.print(" "+map.get(key)+" ");	
  }	
  System.out.println();
  Collection collection=map.values();
  System.out.println(collection);
  System.out.println(map);
 }
}