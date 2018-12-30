public class MyStringv1
{
 public static void main(String argv[])
 {
  MyObject obj1=new MyObject(1);
  MyObject obj2=(MyObject)obj1.clone();
  
  MyObject obj3[]=new MyObject[3];
  obj3[0]=new MyObject(1);
  obj3[1]=new MyObject(2);
  obj3[2]=new MyObject(3);
  System.out.println("obj3[0].data = "+obj3[0].data);
  obj3[0].data=2;
  System.out.println("obj3[0].data = "+obj3[0].data);
  
  
  
  
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