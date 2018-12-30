import java.util.*;
public class EX10
{
 public static void main(String argv[]) throws Exception
 {
  List<String>list=Collections.synchronizedList(new LinkedList<String>());
  排隊 排隊看電影=new 排隊(list);
  進場 可以進場 = new 進場(list);
  排隊看電影.start();
  Thread.sleep(600);
  可以進場.start();
  
  while(list.size()>0)
  {
   System.out.println(list);
   Thread.sleep(200);	
  }	
  System.exit(0);
 }
}

class 排隊 extends Thread
{
 List<String> list;	
 public 排隊(List<String>list)
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

class 進場 extends Thread
{
 List <String>list;
 public 進場(List<String>list)
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