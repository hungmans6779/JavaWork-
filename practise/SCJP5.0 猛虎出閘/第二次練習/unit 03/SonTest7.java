class Father
{
 String name="Fahter";
 String getName()
 {
  return name;
 }
 String greeting()
 {
  return "class Father";
 }
}

public class SonTest7 extends Father
{
 String name="Son";
 String greeting()
 {
  return "class Son";
 }
 public void go()
 {
  System.out.println(name);
  System.out.println(this.name);
  System.out.println(super.name);
  System.out.println(((SonTest7)this).name);
  System.out.println(((Father)this).name);
  System.out.println(((SonTest7)this).greeting());
  System.out.println(((Father)this).greeting());
  System.out.println(super.greeting());
 }
 public static void main(String argv[])
 {
 	new SonTest7().go();
 }	
}

