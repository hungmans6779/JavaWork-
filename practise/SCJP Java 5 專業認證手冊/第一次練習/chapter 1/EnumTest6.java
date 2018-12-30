enum CoffeeSize
{
 BIG(8),HUGE(10),OVERWHELMING(16);
 CoffeeSize(int ounces)
 {
  this.ounces=ounces;
 }
 private int ounces;
 public int getOunces()
 {
  return ounces;
 }
}

public class EnumTest6
{
 CoffeeSize size;
 public static void main(String argv[])
 {
  EnumTest6 drink1=new EnumTest6();
  drink1.size=CoffeeSize.BIG;
  EnumTest6 drink2=new EnumTest6();
  drink2.size=CoffeeSize.HUGE;
  EnumTest6 drink3=new EnumTest6();
  drink3.size=CoffeeSize.OVERWHELMING;
  System.out.println("BIG = "+drink1.size.getOunces());
  System.out.println("HUGE = "+drink2.size.getOunces());
  System.out.println("OVERWHELING = "+drink3.size.getOunces());
 }
}