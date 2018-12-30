public class StringEqualv3
{
 public static void main(String argv[])
 {
  MyObjectv3  obj1=new MyObjectv3(1);
  MyObjectv3  obj2=new MyObjectv3(1);
  MyObjectv3  obj3=new MyObjectv3(3);
  
  System.out.println(obj1.equals(obj2));
  System.out.println(obj1.equals(obj3));
 }
}