import java.util.*;
public class HashtableTest1
{
 public static void main(String argv[])
 {
  Hashtable ht=new Hashtable();
  ht.put("A","SCJP");
  //ht.put(null,null); //Hashtable類別不允許key和value有null;
  ht.put("B","ere");
  ht.put("C",new Integer(100));
  ht.put(new Integer(200),"D");
  System.out.println("Hashtable's size:"+ht.size());
  System.out.println("Hashtable's 的內容為:"+ht.toString());
  System.out.println("是否包含key鍵值為C :"+ht.containsKey("C"));
  System.out.println("是否包含key鍵值為100 :"+ht.containsKey(100));
  System.out.println("是否包含key鍵值為200 :"+ht.containsKey(200));
  System.out.println("是否包含value值為ere :"+ht.containsValue("ere"));
  System.out.println("是否包含value值為100 :"+ht.containsValue(100));
  ht.clear();
  System.out.println("Hashtable's 的內容為:"+ht.toString());
  
 }
}