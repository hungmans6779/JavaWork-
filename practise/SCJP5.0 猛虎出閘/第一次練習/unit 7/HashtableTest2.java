import java.util.*;
public class HashtableTest2
{
 public static void main(String argv[])
 {	
  Map ht=new Hashtable();
  ht.put("A","AAAAAAAAAAAAAAAAA");
  ht.put(new Integer(10),new Integer(20));
  ht.put("B","BBBBBBBBBBBBBBBBBBBBBBBBBBBB");
  //Hashtable的鍵值及value不能是null
  //ht.put(null,10);
  ht.put("A","BBBBBBBBBBBBBBBBBBBBBBB");
  System.out.println(ht.toString());
  System.out.println("鍵值A= "+ht.get("A"));
  System.out.println("鍵值B= "+ht.get("B"));
  System.out.println("鍵值10= "+ht.get(10));
  System.out.println("鍵值10= "+ht.get(new Integer(10)));
 
 } 
}