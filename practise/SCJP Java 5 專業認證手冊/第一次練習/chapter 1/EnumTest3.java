class Coffee
{
 enum CoffeeSize
 {
  BIG,HUGE,OVERWHELMING
 }
 CoffeeSize size;
}

public class EnumTest3
{
 public static void main(String argv[])
 {
  Coffee drink=new Coffee();
  drink.size=Coffee.CoffeeSize.BIG;
  System.out.println(drink.size);
 }
}