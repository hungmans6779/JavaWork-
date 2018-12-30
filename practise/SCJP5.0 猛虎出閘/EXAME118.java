class Alpha
{
 public void foo(String ... vargs)
 {
  System.out.println("Alpha:foo");
 }
 public void bar(String str)
 {
  System.out.println("Alpha:bar");
 }
}

public class EXAME118 extends Alpha
{
 public void foo(String str)
 {
  System.out.println("Beta:foo");
 }
 public void bar(String str)
 {
  System.out.println("Beta:bar");
 }
 public static void main(String argv[])
 {
  Alpha a=new EXAME118();
  EXAME118 b=(EXAME118)a;
  a.foo("test");
  b.foo("test");
  a.bar("test");
  b.bar("test");
 }

}