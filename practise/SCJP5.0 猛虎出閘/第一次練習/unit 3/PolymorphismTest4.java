class Father
{
 String name="Father";
 String getName()
 {
  return name;
 }
 String greeting()
 {
  return "class Father";
 }
}
class Son extends Father
{
 String name="Son";
 String greeting()
 {
  return "class Son";
 }
}

public class PolymorphismTest4
{
 public static void main(String argv[])
 {
  Father a=(Father)new Son();
  System.out.println("1."+a.greeting());
  System.out.println("2."+((Father)a).greeting());
  System.out.println("3."+a.name);
  System.out.println("4."+((Son)a).name);
  System.out.println("5."+a.getName());
  System.out.println("6."+((Son)a).getName());
 
  System.out.println("=====================");
  Father a1=new Son(); 
  System.out.println("1."+a1.name);
  System.out.println("2."+((Son)a1).name);
  System.out.println("3."+a1.getName());
  System.out.println("4."+((Son)a1).getName());
  System.out.println("5."+a1.greeting());
  System.out.println("6."+((Father)a1).greeting());
 
  
  
 }
}