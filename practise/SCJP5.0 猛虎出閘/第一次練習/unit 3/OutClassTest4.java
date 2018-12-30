public class OutClassTest4
{
 public static void main(String argv[])
 {
 	System.out.println("===============================================");
  OutClassTest4.InnerClass in=new OutClassTest4().new InnerClass();
  in.foo();
  System.out.println("===============================================");
  new OutClassTest4().new InnerClass().foo();
  System.out.println("===============================================");
  //new InnerClass().foo();
  new OutClassTest4().move();
 }
  void move()
 {
 	new InnerClass().foo();
 }	
 public class InnerClass
 {
  void foo()
  {
   System.out.println("我是Regular的foo方法");
  }
 }
}