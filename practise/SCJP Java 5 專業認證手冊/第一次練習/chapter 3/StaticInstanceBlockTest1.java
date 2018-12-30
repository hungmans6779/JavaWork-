public class StaticInstanceBlockTest1
{
 static
 { System.out.println("第一個static block"); }
 { System.out.println("第一個instance block"); }
 StaticInstanceBlockTest1()
 {
  System.out.println("沒有引數的建構子");
 }
 StaticInstanceBlockTest1(int i)
 {
  System.out.println("有引數的建構子");
 }
 
 static
 { System.out.println("第二個static block"); }
 { System.out.println("第二個instance block"); }
 public static void main(String argv[])
 {
  new StaticInstanceBlockTest1();
  new StaticInstanceBlockTest1(1);
 }
}