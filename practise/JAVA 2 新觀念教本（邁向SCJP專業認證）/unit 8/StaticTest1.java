public class StaticTest1
{
 public static void main(String argv[])
 {
  Super a=new Super();
  Sub b=new Sub();
  b.className="�z�L�l���O�ܧ���";
  System.out.println(a.className);
  b.setName("�z�L�l���O����className");
  System.out.println(a.className);
 }
}

class Super
{
 static String className="Super";
 void setName(String n)
 {
  className=n;
 }
}

class Sub extends Super
{
 
}