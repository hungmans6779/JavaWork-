interface Foo
{
 public void foo();
}

class Bar
{
 public void doTest(Foo f)
 {
  f.foo();
 }
}

public class AnonymousInnerClassTest5
{
 public static void main(String argv[])
 {
  Bar b=new Bar();
  b.doTest(new Foo()
  {
   public void foo()
   {
    System.out.println("§Ú¬O§Ú¡I");
   }
  });
 }
}