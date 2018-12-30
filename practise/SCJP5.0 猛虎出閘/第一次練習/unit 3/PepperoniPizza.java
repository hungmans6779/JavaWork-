import java.util.*;
class Pizza
{
 ArrayList toppings;
 public  void addTopping(String topping)
 {
  toppings.add(topping);
 }
}
public class PepperoniPizza extends Pizza
{
 public void addTopping(String topping)
 {
  System.out.println("Cannot and Uoppings");
 }
 public static void main(String argv[])
 {
  Pizza pizza =new PepperoniPizza();
  pizza.addTopping("Mushrooms");
 }
}