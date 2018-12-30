public class EX16_1
{
 public static void main(String argv[])
 {
  Super s=new Sub();
  //System.out.println(s.getF());
  System.out.println(((Sub)s).getF());
 }
}

class Super
{

}

class Sub extends Super
{
 private String f="Sub";
 String getF()
 {
  return f;
 }
}