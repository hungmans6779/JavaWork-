class InstanceInitializerTest3
{
 int count;
 String kind;
 String name;
 static int scount;
 static String skind;
 static String sname;
 private InstanceInitializerTest3()
 {
  
 }
 private InstanceInitializerTest3(int i)
 {
  count=i;
 }
 
 {
  count=10;
  kind="lion";
  name="Pet";
  scount=50;
  skind="cat";
  sname="Mary";
 }
  public static void main(String argv[])
  {
   new InstanceInitializerTest3().show();
   System.out.println("============================");
   new InstanceInitializerTest3(100).show();
  }
  void show()
  {
   System.out.println("count = "+count);
   System.out.println("kind = "+kind);
   System.out.println("name = "+name);	
   System.out.println("scount = "+scount);
   System.out.println("skind = "+skind);
   System.out.println("sname = "+sname); 
  }	
}