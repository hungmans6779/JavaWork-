public class EX25
{
 public static void main(String argv[])
 {
  Super s=new Super()
  {
   {
    System.out.println("目前的建構子 : "+this);
   } 
   void m()
   {
    System.out.println("覆蓋過m的方法！！！");
   }
   void n()
   {
    System.out.println("自訂的n方法.............");
   }
  };
  
  s.m();
 }
}

class Super
{
 void m()
 {
  System.out.println("Super 實體的m方法");
 }
}