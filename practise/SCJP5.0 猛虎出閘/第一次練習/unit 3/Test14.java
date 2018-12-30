class Test14
{
 private int i=1;	
 public static void main(String argv[])
 {
 	int i=10;
  new Test14().foo1();
 	foo2();

 }
 void foo1()
 {
  System.out.println("我是非靜態的foo1");	
 }
 static void foo2()
 {
 	System.out.println("我是靜態的foo2");
 }		
}	