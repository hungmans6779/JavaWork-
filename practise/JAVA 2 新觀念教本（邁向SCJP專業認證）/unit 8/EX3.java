public class EX3
{
 public static void main(String argv[])
 {
  Super a=new Super();
  Sub b=new Sub();
  b.className="透過子類別物件更改父類別屬性";
  System.out.println(a.className);
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