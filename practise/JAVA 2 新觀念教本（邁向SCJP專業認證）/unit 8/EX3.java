public class EX3
{
 public static void main(String argv[])
 {
  Super a=new Super();
  Sub b=new Sub();
  b.className="�z�L�l���O����������O�ݩ�";
  System.out.println(a.className);
  b.setClass("�z�L�l���O����I�s�����O��k");
  System.out.println(Sub.className);
 
 }
}

class Super
{
 static String className="Super";
 String data="superdata";
 static void setClass(String n)
 {
  className=n;
 }
}

class Sub extends Super
{
 int j=2;
}