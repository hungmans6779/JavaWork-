class Super
{
 String s="��";
}
class Sub extends Super
{
 String s="����";
}

public class EX1_8
{
 public static void main(String argv[])
 {
  Super a=new Sub();
  System.out.println(a.s);
 }
}