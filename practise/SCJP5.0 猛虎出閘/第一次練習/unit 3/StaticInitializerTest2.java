class StaticInitializerTest2
{
 static String name;
 int count;
 public StaticInitializerTest2()
 {
 	
 }
 private StaticInitializerTest2(int i)
 {
 	
 }		
 static
 {
  name="Mary";
  //count=10;
 }
 public static void main(String argv[])
 {
  new StaticInitializerTest1().show();
 }
 void show()
 {
  System.out.println("name = "+name);
 }
}