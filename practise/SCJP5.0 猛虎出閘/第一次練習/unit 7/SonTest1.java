//���d�ҬO���~��
//�]��Son�I�snew SonTest1()�ɡA��Father�S��Father()���غc�l..............
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
}
public class SonTest1 extends Father
{ 
 public SonTest1(String data)
 {
  System.out.println(super.getName());
 }
 public SonTest1()
 {
  System.out.println("�@�w���~�r");
 }
 
 public static void main(String arv[])
 {
  new SonTest1();
 }
}