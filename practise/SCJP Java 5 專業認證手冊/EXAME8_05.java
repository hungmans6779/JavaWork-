class Foo
{
 class Bar{}
}


public class EXAME8_05
{
 public static void main(String argv[])
 {
  Foo f=new Foo();
  Foo.Bar b=f.new Bar();
 }
}