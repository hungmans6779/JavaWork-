import java.util.*;
public class IteratorExample2
{
 public static void main(String argv[])
 {
  Set set=new HashSet();
  set.add(new Integer(5));
  set.add("abc");
  set.add(new Integer(10));
  set.add(new Double(10.2));
  set.add(new Boolean(true));
  set.add(new Float(12.23));
  set.add(new Integer(5));
  System.out.println("��set�����e�� : "+set);
  
  int count=1;
  Iterator it=set.iterator();
  while(it.hasNext())
  {
   System.out.println("�� "+count+" �Ӥ����O : "+it.next());
   if(count==2)
   {
   	it.remove();
   }	
   count++;	
  }
  
  	
  count=1;
  System.out.println("��set�����e�� : "+set);
  Iterator it1=set.iterator();
  while(it1.hasNext())
  {
   System.out.println("�� "+count+" �Ӥ����O : "+it1.next());
   count++;	
  }	
  
 }
}