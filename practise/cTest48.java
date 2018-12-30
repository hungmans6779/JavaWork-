class Super
{
 static
 {
  System.out.println("Super static 1 ...");
 }
 static 
 {
  System.out.println("Super static 2...");
 }
 {
  System.out.println("Super instance 1");
 }
 public Super()
 {
  System.out.println("Super Constructor");
 }
}

class Sub extends Super
{
 static
 {
  System.out.println("static 1 ...");
 }
 static 
 {
  System.out.println("static 2...");
 }
 {
  System.out.println("instance 1");
 }
 public Sub()
 {
  System.out.println("Constructor");
 }
}

public class cTest48
{
 public static void main(String argv[])
 {
  new Sub();
 }
}