import java.util.*;
class Pizza
{
 java.util.ArrayList toppings;
 public void addTopping(String topping)  
 {
  toppings.add(topping);
 }
}
public class EXAME147_1 extends Pizza
{
 public void addTopping(String topping)
 {
  System.out.println("Cannot and Uoppings");
 }
 public static void main(String argv[])
 {
  Pizza pizza =new EXAME147_1();
  pizza.addTopping("Mushrooms");
 }
}