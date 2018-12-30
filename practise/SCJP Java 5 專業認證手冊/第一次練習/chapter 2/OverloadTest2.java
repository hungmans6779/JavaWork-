class Animal{}
class Horse extends Animal{}
public class OverloadTest2
{
 void doName(Animal a)
 {
 	System.out.println("Animal");
 }	
 public void doName(Horse h)
 {
 	System.out.println("Horse");
 }	
 public static void main(String argv[])
 {
  new OverloadTest2().doName(new Animal());
  new OverloadTest2().doName(new Horse());
  Animal a=new Horse();
  new OverloadTest2().doName(a);
 }
}