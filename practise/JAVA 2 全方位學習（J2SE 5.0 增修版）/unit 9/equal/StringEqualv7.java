public class StringEqualv7
{
 public static void main(String argv[])
 {
  MyObjectv7 obj1=new MyObjectv7(1);
  MyObjectv7 obj2=(MyObjectv7)obj1.clone();
  
  System.out.println("obj1'data = "+obj1.data);
  System.out.println("obj1'data = "+obj2.data);
  
  obj2.data=3;
  System.out.println("After......");
  System.out.println("obj1'data = "+obj1.data);
  System.out.println("obj1'data = "+obj2.data);
  
  System.out.println(obj1.toString());
  System.out.println(obj2.toString());
 
 }
}