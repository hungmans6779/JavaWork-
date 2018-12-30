class Foo
{
 private int x;
 public Foo(int x)
 {
  this.x=x;
 }
 public void set(int x)
 {
  this.x=x;
 }
 public int getX()
 {
  return x;
 }
}

public class EXAME31
{
 static Foo fooBar(Foo foo)
 {
  foo=new Foo(100);
  return foo;
 }
 public static void main(String argv[])
 {
  Foo foo=new Foo(300);
  System.out.print(foo.getX()+"-");
  Foo fooFoo=fooBar(foo);
  System.out.print(foo.getX()+"-");
  System.out.print(fooFoo.getX()+"-");
  foo=fooBar(fooFoo);
  System.out.print(foo.getX()+"-");
  System.out.print(fooFoo.getX());
 }
}