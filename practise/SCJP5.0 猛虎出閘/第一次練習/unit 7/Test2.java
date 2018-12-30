class Test
{
 private String name;
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

public class Test2 extends Test
{
 public Test2(String data)
 {
  super(data);
 }
 public static void main(String argv[])
 {
  new Test2("SCJP");
  new Test();
 }
}