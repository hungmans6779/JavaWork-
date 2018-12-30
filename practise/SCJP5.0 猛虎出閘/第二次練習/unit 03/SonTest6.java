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

public class SonTest6 extends Father
{
 String name="Son";
 String greeting()
 {
  return "class Son";
 }
 public static void main(String argv[])
 {
 	Father father=new SonTest6();
 	System.out.println(((SonTest6)father).name);
 	System.out.println(((SonTest6)father).getName());
 	System.out.println(((SonTest6)father).greeting());
 }	
}

