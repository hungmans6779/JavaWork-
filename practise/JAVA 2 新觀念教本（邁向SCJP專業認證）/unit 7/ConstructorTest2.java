class ConstructorTest2
{
 public ConstructorTest2(int i)
 {
  System.out.println("test");
 }
 public static void main(String argv[])
 {
  new ConstructorTest2(1);
  ConstructorTest2();
 }
 static void ConstructorTest2()
 {
 	System.out.println("test2");
 }	
}