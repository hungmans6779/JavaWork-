public class StaticInstanceBlockTest1
{
 static
 { System.out.println("�Ĥ@��static block"); }
 { System.out.println("�Ĥ@��instance block"); }
 StaticInstanceBlockTest1()
 {
  System.out.println("�S���޼ƪ��غc�l");
 }
 StaticInstanceBlockTest1(int i)
 {
  System.out.println("���޼ƪ��غc�l");
 }
 
 static
 { System.out.println("�ĤG��static block"); }
 { System.out.println("�ĤG��instance block"); }
 public static void main(String argv[])
 {
  new StaticInstanceBlockTest1();
  new StaticInstanceBlockTest1(1);
 }
}