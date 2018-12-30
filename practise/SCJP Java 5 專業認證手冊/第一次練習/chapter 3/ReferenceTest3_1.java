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

public class ReferenceTest3_1
{
 public static void main(String argv[])
 {
  Foo f=new Foo();
  ReferenceTest3_1 r=new ReferenceTest3_1();
  f.setName("Java f");
  System.out.println(f.getName());
  r.doTest(f);
  System.out.println(f.getName());
 }
 void doTest(Foo g)
 {
  g.setName("Java change");
  g=new Foo();
  g.setName("Java okwap");
  System.out.println(g.getName());
 }
}