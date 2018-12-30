class Coffee
{
 EnumTest4.CoffeeSize size;
}

public class EnumTest4
{
 enum CoffeeSize
 {
  BIG,HUGE,OVERWHELMING
 }
 public static void main(String argv[])
 {
  Coffee drink=new Coffee();
  drink.size=CoffeeSize.BIG;
  System.out.println(drink.size);
 }

}