public class EX4
{
 public static void main(String argv[])
 {
  Super a=new Super();
  Sub b=new Sub();
  //System.out.println(a.data);
  //System.out.println(b.data);
  System.out.println(a.getData());
  b.setData("�ܧ���");
  //System.out.println(a.getData());
  System.out.println(b.getData());
 }
}
class Super
{
 private String data="���n���";
 void setData(String n)
 {
  data=n;
 }
 String  getData()
 {
  return data;
 }
}

class Sub extends Super
{

}