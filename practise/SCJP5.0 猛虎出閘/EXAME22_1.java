class Father
{
 private final void aMethod()
 {
  System.out.println("我是父類別的aMethod 方法");
 }
}
public class EXAME22_1 extends  Father
{
 private final void aMethod()
 {
  System.out.println("我是自已的aMethod方法");
 }
 public static void main(String argv[])
 {
  EXAME22_1 e1=new EXAME22_1();
  e1.aMethod();
  
  /* 造成編譯錯誤 
  Father f1=new Father();
  f1.aMethod();  //aMethod()是private所以不能在其它的類別內被使用
  */
  
  
  /*造成編譯錯誤
  Father e2=new EXAME22_1();
  e2.aMethod();
  */
 }
}