class Name
{
 private String name;
 public Name(String name)
 {
  this.name=name;
 }
 String getName()
 {
  return name;
 }
}

public class Test
{
 public Test(Name n)
 {
  System.out.println(n.getName());
 }
 public static void main(String argv[])
 {
  Name n=new Name("¤p¥m¾´");
  new Test(n);
 }
}