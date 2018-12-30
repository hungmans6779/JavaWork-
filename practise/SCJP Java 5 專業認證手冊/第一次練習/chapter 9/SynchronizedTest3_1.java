import java.util.*;
class MyList
{
 List myList=new LinkedList();
 public synchronized void add(String name)
 {
  myList.add(name);
 }
 public synchronized String removeFirst()
 {
  if(myList.size()>0)
  {
   return (String)myList.remove(0);
  }
  else
  {
   return null;
  }
 }
}

public class SynchronizedTest3_1
{
 public static void main(String argv[])
 {
 	 final MyList my=new MyList();
  my.add("Jacky");
  class MyThread extends Thread
  {
   public void run()
   {
    System.out.println(my.removeFirst());
   }
  }
  MyThread t1=new MyThread();
  MyThread t2=new MyThread();
  t1.start();
  t2.start();
 }
}