import java.util.*;
public class EX10
{
 public static void main(String argv[]) throws Exception
 {
  List<String>list=Collections.synchronizedList(new LinkedList<String>());
  �ƶ� �ƶ��ݹq�v=new �ƶ�(list);
  �i�� �i�H�i�� = new �i��(list);
  �ƶ��ݹq�v.start();
  Thread.sleep(600);
  �i�H�i��.start();
  
  while(list.size()>0)
  {
   System.out.println(list);
   Thread.sleep(200);	
  }	
  System.exit(0);
 }
}

class �ƶ� extends Thread
{
 List<String> list;	
 public �ƶ�(List<String>list)
 {
 	this.list=list;
 }		
 public void run()
 {
  for(int i=0;i<26;i++)
  {	
 	 String people=""+(char)('A'+i);
 	 try
 	 {
 	 	Thread.sleep((int)(Math.random()*10));
 	 }
 	 catch(InterruptedException ie)
 	 {
 	  ie.printStackTrace();	
 	 }		
 	 list.add(people);
 	} 
 }		
}	

class �i�� extends Thread
{
 List <String>list;
 public �i��(List<String>list)
 {
 	this.list=list;
 }		
 public void run()
 {
 	while(true)
 	{
 	 try
 	 {
 	 	Thread.sleep((int)(Math.random()*100));
 	 }
 	 catch(InterruptedException	ie)
 	 {
 		ie.printStackTrace();
 	 }	
 	 if(list.size()>0)
 	  list.remove(0);
 	}	
 }	
}	