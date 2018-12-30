public class StringEqualv5
{
 public static void main(String argv[])
 {
  MyObjectv5  obj1=new MyObjectv5(1);
  MyObjectv5  obj2=obj1;

 
  System.out.println("Obj1'hash Code = "+obj1.data);
  System.out.println("Obj2'hash Code = "+obj2.data);
  
  obj2.data=3;
  System.out.println("After.......");
  System.out.println("Obj1'hash Code = "+obj1.data);
  System.out.println("Obj2'hash Code = "+obj2.data);
 }
}