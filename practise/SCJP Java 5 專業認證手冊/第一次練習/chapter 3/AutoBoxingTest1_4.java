public class AutoBoxingTest1_4
{
 public static void main(String argv[])
 {
  AutoBoxingTest1_4 a=new AutoBoxingTest1_4();
  System.out.println(a.go(3));
 }
 boolean go(Integer i)
 {
  Boolean bo=true;
  Short s=10;
  if(bo)
  {
   System.out.println(++s);	
  }	
  return !bo;
 }
}