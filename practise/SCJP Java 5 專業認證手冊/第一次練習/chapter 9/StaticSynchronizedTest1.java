class MyClass{}

public class StaticSynchronizedTest1
{
 public static void main(String argv[])
 {
 
 }
 public static synchronized void getCount1()
 {
  System.out.println("count1");
 }
 public static void getCount2()
 {
  synchronized(MyClass.class)
  {
   System.out.println("count2");
  }
 }
 public static void getCount3()
 {
 	try
 	{
   Class c1=Class.forName("MyClass");
   synchronized(c1)
   {
    System.out.println("count3");
   }
  }
  catch(ClassNotFoundException cce)
  {} 

 }
}