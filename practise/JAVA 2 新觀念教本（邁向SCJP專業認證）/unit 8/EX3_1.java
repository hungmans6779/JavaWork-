public class EX3_1
{
 public static void main(String argv[])
 {
  Super a=new Super();
  Sub b=new Sub();
  b.className="�z�L�l���O����������O�ݩ�";
  b.data="�ܧ�᪺data";
  System.out.println(a.className);
  System.out.println(a.data);
 
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