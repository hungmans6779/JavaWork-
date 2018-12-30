public class EX3_1
{
 public static void main(String argv[])
 {
  Super a=new Super();
  Sub b=new Sub();
  b.className="透過子類別物件更改父類別屬性";
  b.data="變更後的data";
  System.out.println(a.className);
  System.out.println(a.data);
 
  b.setClass("透過子類別物件呼叫父類別方法");
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