//此範例是錯誤的
//因為Son呼叫new SonTest1()時，而Father沒有Father()的建構子..............
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
  System.out.println("一定錯誤呀");
 }
 
 public static void main(String arv[])
 {
  new SonTest1();
 }
}