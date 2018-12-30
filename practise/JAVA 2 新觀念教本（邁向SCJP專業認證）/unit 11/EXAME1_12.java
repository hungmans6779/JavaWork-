class AClass
{
 private String s;
 public AClass(String s)
 {
  this.s=s;
 }
 public void finalize()
 {
  EXAME1_12.a=this;
 }
 public String toString()
 {
  return s;
 }
}

public class EXAME1_12
{
 static AClass a;
 public static void main(String argv[])
 {
  a=new AClass("abcd");
  a=null;
  System.gc();
  System.out.println(a.toString());
 }
}