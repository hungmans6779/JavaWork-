public class StaticTest1
{
 public static void main(String argv[])
 {
  Super a=new Super();
  Sub b=new Sub();
  b.className="透過子類別變更資料";
  System.out.println(a.className);
  b.setName("透過子類別改變className");
  System.out.println(a.className);
 }
}

class Super
{
 static String className="Super";
 void setName(String n)
 {
  className=n;
 }
}

class Sub extends Super
{
 
}