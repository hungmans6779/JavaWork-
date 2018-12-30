public class EX7
{
 public static void main(String argv[])
 {
  FlyBoy f=new FlyBoy();
  System.out.println(f.is_a+" : "+f.fly());
 }
}

class FlyBoy implements Fly
{
 final String is_a="飛行男孩";
 public String fly()
 {
  AirShip a=new AirShip();
  return a.fly();
 }
}