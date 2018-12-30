class InstanceInitializerTest2
{
 int count;
 String kind;
 String name;
 private InstanceInitializerTest2()
 {
  
 }
 private InstanceInitializerTest2(int i)
 {
  count=i;
 }
 
 {
  count=10;
  kind="lion";
  name="Pet";
 }
  public static void main(String argv[])
  {
   new InstanceInitializerTest2().show();
   System.out.println("============================");
   new InstanceInitializerTest2(100).show();
  }
  void show()
  {
   System.out.println("count = "+count);
   System.out.println("kind = "+kind);
   System.out.println("name = "+name);	
  }	
}