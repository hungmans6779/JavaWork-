class Test
{
 private String name;
 public Test(String name)
 {
  this.name=name;
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
  Test t1=new Test("¤p¥m¾´");
  new Test1(t1);
 
 }

}