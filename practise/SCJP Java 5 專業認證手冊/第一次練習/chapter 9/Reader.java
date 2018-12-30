public class Reader extends Thread
{
 Calculator c;
 Reader(Calculator c)
 {
  this.c=c;
 }
 public void run()
 {
  synchronized(c)
  {
   try
   {
    System.out.println("Wait Calculator.....");
    c.wait();
   }
   catch(InterruptedException ie)
   { ie.printStackTrace(); }
  }
  System.out.println(Thread.currentThread().getName()+" Total : "+c.total);
 }
 public static void main(String argv[])
 {
  Calculator c=new Calculator();
  new Reader(c).start();
  new Reader(c).start();
  new Reader(c).start();
  c.start();
 }
}

class Calculator extends Thread
{
 int total;
 public void run()
 {
  synchronized(this)
  {
   for(int i=0;i<=100;i++)
   {
    total+=i;
   }
   //notifyAll();
   notify();
  }
 }
}