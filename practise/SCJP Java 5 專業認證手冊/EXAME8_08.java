public class EXAME8_08
{
 EXAME8_08(){System.out.print("foo"); }
 class Bar
 {
  Bar(){System.out.print("bar"); }
  public void go(){System.out.print("hi"); }
 }
 public static void main(String argv[])
 {
  EXAME8_08 f=new EXAME8_08();	
  f.makeBar();
 }	
 void makeBar()
 {
 	/* 都可以執行
  new Bar().go();	
  new Bar(){}.go();
  */
  
  (new Bar(){}).go();
 }	
}