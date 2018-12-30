class InstanceInitializerTest1
{
 int count;
 String kind;
 String name;
 private InstanceInitializerTest1()
 {
 
 }
 private InstanceInitializerTest1(int i)
 {
 
 }
 
 {
  count=10;
  kind="lion";
  name="Pet";
 }
  public static void main(String argv[])
  {
   new InstanceInitializerTest1().show();
   System.out.println("============================");
   new InstanceInitializerTest1(100).show();
  }
  void show()
  {
   System.out.println("count = "+count);
   System.out.println("kind = "+kind);
   System.out.println("name = "+name);	
  }	
}