import java.util.*;
public class EXAME111
{
 public static void main(String argv[])
 {
 
 }
 public void takeList(List<? extends String>list)
 {
 	//list.add("Foo"); //�sĶ����
 	list=new ArrayList<String>();
 	// list=new ArrayList<Object>(); //�sĶ���� 
 	String s=list.get(0);
 	Object o=list;
 }	
}