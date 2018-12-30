public class EX4
{
 public static void main(String argv[])
 {
  Super a=new Super();
  Sub b=new Sub();
  //System.out.println(a.data);
  //System.out.println(b.data);
  System.out.println(a.getData());
  b.setData("變更資料");
  //System.out.println(a.getData());
  System.out.println(b.getData());
 }
}
class Super
{
 private String data="重要資料";
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