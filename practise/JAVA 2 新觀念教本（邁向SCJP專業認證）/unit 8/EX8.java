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
  System.out.println("�����Osuper���غc�l�Q�I�s");
 }
}

class Sub extends Super
{
 Sub()
 {
  System.out.println("�l���Osub���غc�l�Q�I�s");
 }
}