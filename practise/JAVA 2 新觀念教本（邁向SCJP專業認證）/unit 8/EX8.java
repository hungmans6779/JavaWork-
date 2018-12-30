public class EX8
{
 public static void main(String argv[])
 {
  new Sub();
 }
}

class Super
{
 Super()
 {
  System.out.println("父類別super的建構子被呼叫");
 }
}

class Sub extends Super
{
 Sub()
 {
  System.out.println("子類別sub的建構子被呼叫");
 }
}