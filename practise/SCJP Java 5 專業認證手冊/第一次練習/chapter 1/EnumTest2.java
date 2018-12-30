enum CoffeeSize
{
 BIG,HUGE,OVERWHELMING
}

class Coffee
{
 CoffeeSize size;
}

public class EnumTest2
{
 public static void main(String argv[])
 {
  Coffee drink=new Coffee();
  drink.size=CoffeeSize.BIG;
  System.out.println(drink.size);
 }
}