class Test
{
 private String name;
 public Test(String data)
 {
  name=data;
 }
 public String getName()
 {
  return name;
 }
}

public class Test1
{
 public Test1(Test t)
 {
  System.out.println(t.getName());
 }
 public static void main(String argv[])
 {
  Test t=new Test("SCJP");
  new Test1(t); 
 }
}