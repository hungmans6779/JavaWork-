public class StringEqualv6
{
 public static void main(String argv[])
 {
  MyObjectv6 obj1=new MyObjectv6(1);
  MyObjectv6 obj2=(MyObjectv6)obj1.clone();
  
  System.out.println("obj1'data = "+obj1.data);
  System.out.println("obj1'data = "+obj2.data);
  
  obj2.data=3;
  System.out.println("After......");
  System.out.println("obj1'data = "+obj1.data);
  System.out.println("obj1'data = "+obj2.data);
 
 }
}