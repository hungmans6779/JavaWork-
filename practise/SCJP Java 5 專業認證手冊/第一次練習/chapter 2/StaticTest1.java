public class StaticTest1
{
 static int count=0;
 static int getCount()
 {
  return count;
 }
 StaticTest1()
 {
  count+=1;
 }
 public static void main(String argv[])
 {
 	for(int i=0;i<10;i++)
 	{
   new StaticTest1();
  }
  System.out.println("count = "+getCount()); 
  System.out.println("count = "+new StaticTest1().getCount());
  System.out.println(new StaticTest1().count);
 }
}