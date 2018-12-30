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
  System.out.println("以後不要再犯錯了喔");
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
  System.out.println("以後我不會再犯錯誤了呀");
 }
 
 public static void main(String arv[])
 {
  new SonTest2();
 }
}