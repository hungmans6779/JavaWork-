import java.util.*;
public class SortedMapTest2
{
 public static void main(String argv[])
 {
  TreeMap sm=new TreeMap();	
  sm.put("A","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
  sm.put("A","aaaa");
  sm.put("B","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
  //SortedMap����ȶ����P�@�ث��A���e
  //sm.put(new Integer(10),"test");
  //TreeMap��Ȥ��o��null
  //sm.put(null,"test");
  sm.put("C",null);
  sm.put("D","SCJP");
  sm.put("F","SCWCD");
  sm.put("E","SCMAD");
  System.out.println("��Map���������@��: "+sm.size());
  System.out.println("��Map�����e���O��: "+sm.toString());
  System.out.println("�Ĥ@����Ȥ��e��: "+sm.firstKey());
  System.out.println("�̫����Ȥ��e��: "+sm.lastKey());
  System.out.println("A��Ȥ��e��: "+sm.get("A"));
  System.out.println("B-E��Ȥ��e���O��: "+sm.subMap("B","E"));
  System.out.println("E���e����Ȥ��e���O��: "+sm.headMap("E"));
  System.out.println("C���e����Ȥ��e���O��: "+sm.headMap("C"));
  System.out.println("==========================================");
  System.out.println("�������C");
  sm.remove("C");
  System.out.println("��Map���������@��: "+sm.size());
  System.out.println("��Map�����e���O��: "+sm.toString());
 
 }	
}