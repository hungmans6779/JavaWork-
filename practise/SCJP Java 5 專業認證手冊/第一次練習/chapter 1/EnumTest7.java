 enum CoffeeSize
{
 BIG(8),HUGE(10),OVERWHELMING(16)
 {
  public String getLidCode()
  {
   return "A";
  }
 }
 ;
 private int ounces;
 CoffeeSize(int ounces)
 {
  this.ounces=ounces;
 }
 public int getOunces()
 {
  return ounces;
 }
 public String getLidCode()
 {
  return "B";
 }
} 

public class EnumTest7
{
 CoffeeSize size;
 public static void main(String argv[])
 {
  EnumTest7 e1=new EnumTest7();
  e1.size=CoffeeSize.BIG;
  System.out.println("BIG = "+e1.size.getOunces());
  System.out.println("BIG = "+e1.size.getLidCode());
  
  EnumTest7 e2=new EnumTest7();
  e2.size=CoffeeSize.HUGE;
  System.out.println("HUGE = "+e2.size.getOunces());
  System.out.println("HUGE = "+e2.size.getLidCode());
  
  EnumTest7 e3=new EnumTest7();
  e3.size=CoffeeSize.OVERWHELMING;
  System.out.println("OVERWHELMING = "+e3.size.getOunces());
  System.out.println("OVERWHELMING = "+e3.size.getLidCode());
 }
}