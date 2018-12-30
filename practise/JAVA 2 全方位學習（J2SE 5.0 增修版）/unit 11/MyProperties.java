 import java.util.Properties;
 class MyProperties
 { 
  static String property=" ";
  public static void main(String argv[])
  {
   property=System.getProperty("P1");
   System.out.println("Property 'P1' = "+property);
   property=System.getProperty("P2");
   System.out.println("Property 'P2' = "+property);
  }
 }