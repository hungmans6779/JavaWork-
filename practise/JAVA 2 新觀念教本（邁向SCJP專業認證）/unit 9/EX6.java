public class EX6
{
 public static void main(String argv[])
 {
  Balloon b=new Balloon();
  AirShip a=new AirShip();
  System.out.println(b.is_a+ " : "+b.fly());
  System.out.println(a.is_a+ " : "+a.fly()); 
 }
}

interface Fly
{
 String fly();
}
class Balloon implements Fly
{
 String is_a="��y";
 public String fly()
 {
  return "�ڥi�H���I�I�I";
 }
}
class AirShip implements Fly
{
 String is_a="����";
 Balloon b;
 AirShip()
 {
  b=new Balloon();
 }
 public String fly()
 {
  return b.fly();
 }
}