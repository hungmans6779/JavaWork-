import java.util.*;
public class ArrayListTest3
{
 public static void main(String argv[])
 {
 	
  ArrayList al=new ArrayList();
  al.add("SCJP");
  al.add("SCMAD");
  al.add("SCWCD");
  al.add("SCBCD");
  
  Set s1=new HashSet();
  s1.add("MCSE");
  s1.add("MCSD");

  SortedSet ss1=new TreeSet();
  ss1.add(1);
  ss1.add(2);
  
  al.addAll(s1);
  al.addAll(4,ss1);
  al.addAll(ss1);
  al.addAll(s1);
  
  Iterator it=al.iterator();
  System.out.println("��List�ثe�������@�� : "+al.size());
  while(it.hasNext())
  {
   System.out.print(it.next()+"\t");	
  }
  System.out.println();
  System.out.println("SCWCD��index�ȬO : "+al.indexOf("SCWCD"));
  System.out.println("MCSD��index�ȬO : "+al.indexOf("MCSD"));
  System.out.println("�̫�@��MCSD��index���ȬO : "+al.lastIndexOf("MCSD"));
  System.out.println("���Xindex��4������: "+al.get(4));
  System.out.println(al.subList(1,5));
  System.out.println("=========================================================================");
  System.out.println("����index��4��������");
  al.remove(4);
  System.out.println("�̫�List�����e�� :");
  Iterator it1=al.iterator();
  System.out.println("��List�̫�ѤU�������@�� : "+al.size());
  while(it1.hasNext())
  {
   System.out.print(it1.next()+"\t");	
  }	
  System.out.println();
  System.out.println("���Xindex��4������: "+al.get(4));
 }
}