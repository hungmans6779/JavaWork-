import java.util.*;
class Pizza
{
 java.util.ArrayList toppings;
 public final void addTopping(String topping)  //final ���׹��r�ɭP����Q�мg
 {
  toppings.add(topping);
 }
}
public class EXAME147 extends Pizza
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