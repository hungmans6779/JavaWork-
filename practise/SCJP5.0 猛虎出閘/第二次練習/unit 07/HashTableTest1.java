import java.util.*;
public class HashtableTest1
{
 public static void main(String argv[])
 {
  Hashtable ht=new Hashtable();
  ht.put("A","SCJP");
  //ht.put(null,null); //Hashtable���O�����\key�Mvalue��null;
  ht.put("B","ere");
  ht.put("C",new Integer(100));
  ht.put(new Integer(200),"D");
  System.out.println("Hashtable's size:"+ht.size());
  System.out.println("Hashtable's �����e��:"+ht.toString());
  System.out.println("�O�_�]�tkey��Ȭ�C :"+ht.containsKey("C"));
  System.out.println("�O�_�]�tkey��Ȭ�100 :"+ht.containsKey(100));
  System.out.println("�O�_�]�tkey��Ȭ�200 :"+ht.containsKey(200));
  System.out.println("�O�_�]�tvalue�Ȭ�ere :"+ht.containsValue("ere"));
  System.out.println("�O�_�]�tvalue�Ȭ�100 :"+ht.containsValue(100));
  ht.clear();
  System.out.println("Hashtable's �����e��:"+ht.toString());
  
 }
}