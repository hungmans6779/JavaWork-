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

public class SonTest4 extends Father
{
 String name="Son";
 String greeting()
 {
  return "class Son";
 }
 public static void main(String argv[])
 {
 	Father father=new Father();
 	System.out.println(father.name);
 	System.out.println(father.getName());
 	System.out.println(father.greeting());
 }	
}

