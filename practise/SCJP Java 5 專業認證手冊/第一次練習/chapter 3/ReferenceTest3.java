class Foo
{
 private String name;
 void setName(String name)
 {
  this.name=name;
 }
 String getName()
 {
  return name;
 }
}

public class ReferenceTest3
{
 public static void main(String argv[])
 {
  Foo f=new Foo();
  ReferenceTest3 r=new ReferenceTest3();
  f.setName("Java f");
  System.out.println(f.getName());
  r.doTest(f);
  System.out.println(f.getName());
 }
 void doTest(Foo g)
 {
  g.setName("Java change");
 }
}