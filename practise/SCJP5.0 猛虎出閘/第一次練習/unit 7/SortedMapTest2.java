import java.util.*;
public class SortedMapTest2
{
 public static void main(String argv[])
 {
  TreeMap sm=new TreeMap();	
  sm.put("A","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
  sm.put("A","aaaa");
  sm.put("B","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
  //SortedMap的鍵值須為同一種型態內容
  //sm.put(new Integer(10),"test");
  //TreeMap鍵值不得為null
  //sm.put(null,"test");
  sm.put("C",null);
  sm.put("D","SCJP");
  sm.put("F","SCWCD");
  sm.put("E","SCMAD");
  System.out.println("此Map內的元素共有: "+sm.size());
  System.out.println("此Map的內容分別為: "+sm.toString());
  System.out.println("第一個鍵值內容為: "+sm.firstKey());
  System.out.println("最後個鍵值內容為: "+sm.lastKey());
  System.out.println("A鍵值內容為: "+sm.get("A"));
  System.out.println("B-E鍵值內容分別為: "+sm.subMap("B","E"));
  System.out.println("E之前的鍵值內容分別為: "+sm.headMap("E"));
  System.out.println("C之前的鍵值內容分別為: "+sm.headMap("C"));
  System.out.println("==========================================");
  System.out.println("移除鍵值C");
  sm.remove("C");
  System.out.println("此Map內的元素共有: "+sm.size());
  System.out.println("此Map的內容分別為: "+sm.toString());
 
 }	
}