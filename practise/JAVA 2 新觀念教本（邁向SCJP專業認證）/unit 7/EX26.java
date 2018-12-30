public class EX26
{
 public static void main(String argv[])
 {
  MyStatic si1=new MyStatic();
  EX26.MyStatic si2=new EX26.MyStatic();
  Outer.YourStatic si3=new Outer.YourStatic();
  System.out.println(si1);
  System.out.println(si2);
  System.out.println(si3);
 }
 
 static class MyStatic
 {
 }
}

class Outer
{
 static class YourStatic
 {
 	
 }		
}