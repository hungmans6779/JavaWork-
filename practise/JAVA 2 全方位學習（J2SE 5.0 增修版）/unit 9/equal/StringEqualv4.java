public class StringEqualv4
{
 public static void main(String argv[])
 {
  MyObjectv4  obj1=new MyObjectv4(1);
  MyObjectv4  obj2=new MyObjectv4(1);
  MyObjectv4  obj3=new MyObjectv4(3);
  MyObjectv4  obj4=obj1;
  
  System.out.println("Obj1'hash Code = "+obj1.hashCode());
  System.out.println("Obj2'hash Code = "+obj2.hashCode());
  System.out.println("Obj3'hash Code = "+obj3.hashCode());
  System.out.println("Obj4'hash Code = "+obj4.hashCode());

 }
}