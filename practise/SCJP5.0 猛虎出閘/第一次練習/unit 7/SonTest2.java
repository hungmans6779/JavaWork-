class Father
{
 private String name;
 public Father(String data)
 {
  name=data;
 }
 public String getName()
 {
  return name;
 }
 public Father()
 {
  System.out.println("�H�ᤣ�n�A�ǿ��F��");
 }
}
public class SonTest2 extends Father
{ 
 public SonTest2(String data)
 {
  System.out.println(super.getName());
 }
 public SonTest2()
 {
  System.out.println("�H��ڤ��|�A�ǿ��~�F�r");
 }
 
 public static void main(String arv[])
 {
  new SonTest2();
 }
}