import java.util.*;
public class SortedSetTest4
{
 public static void main(String argv[])
 {
  TreeSet ts1=new TreeSet();
  ts1.add("SCJP");
  ts1.add("SCMAD");
  ts1.add("SCWCD");
  ts1.add("SCBCD");
  ts1.add("1");
  ts1.add("2");
  ts1.add(new String("java"));
  ts1.add("MCSE");
  ts1.add("3");
  ts1.add("MCSD");
  ts1.add("NCCE");
  //TreeSet���X���O�O�L�k�P�ɥ[�J���P���A�����...........
  //ts1.add(new Integer(1));
  
  Iterator it=ts1.iterator();
  System.out.println("�����X�����Ҧ������O");
  while(it.hasNext())
  {
   System.out.print(it.next()+"\t");	
  }  	
  System.out.println("\n\n");
  System.out.println("===================================");
  System.out.println("���X�Ĥ@�Ӥ���");
  System.out.println("�Ĥ@�Ӥ����O: "+ts1.first());
  System.out.println("===================================");
  System.out.println("���X�p��NCCE������");
  System.out.println(ts1.headSet("NCCE"));
  System.out.println("===================================");
  System.out.println("���X�j�󵥩�NCCE������");
  System.out.println(ts1.tailSet("NCCE"));
  System.out.println("===================================");
  System.out.println("���X����3�MSCJP������");
  System.out.println(ts1.subSet("3","SCJP"));
  System.out.println("===================================");
  System.out.println("���X�̫�@�Ӥ���");
  System.out.println("�̫�@�Ӥ����O: "+ts1.last());
 }
}