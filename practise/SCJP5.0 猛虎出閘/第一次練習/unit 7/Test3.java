class Test
{
 static private String name;
 public Test(String data)
 {
  name=data;
 }
 public Test()
 {
  System.out.println(getName());	
 }	
 public String getName()
 {
  return name;
 }
}

public class Test3 extends Test
{
 public Test3(String data)
 {
  super(data);
 }
 public static void main(String argv[])
 {
  new Test3("SCJP");
  new Test();
 }
}