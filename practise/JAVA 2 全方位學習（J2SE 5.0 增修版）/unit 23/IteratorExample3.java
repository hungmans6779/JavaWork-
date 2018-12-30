import java.util.*;
public class IteratorExample3
{
 public static void main(String argv[])
 {
  List linkedList=new LinkedList();
  linkedList.add(new Integer(5));
  linkedList.add("abc");
  linkedList.add(new Integer(10));
  linkedList.add(new Double(12.24));
  linkedList.add(new Boolean(true));
  System.out.println("linkedList�����e�� �G "+linkedList);
  System.out.println("����10����m�O�b : "+linkedList.indexOf(10));
  System.out.println("linkedList���e������3�Ӥ����O �G "+linkedList.get(3));
  System.out.println("����5���S���]�t�blinkedList���e�� : "+linkedList.contains(5));
  System.out.println("linkedList���e�@�� : "+linkedList.size()+" �Ӥ�����");

  ListIterator it=linkedList.listIterator();
  while(it.hasNext())
  {
   System.out.println("�� "+(it.nextIndex()+1)+" �Ӥ����O : "+it.next());
  }	
  
  while(it.hasPrevious())
  {
   System.out.println("�� "+(it.previousIndex()+1)+" �Ӥ����O : "+it.previous());
  }	
  
 }
}