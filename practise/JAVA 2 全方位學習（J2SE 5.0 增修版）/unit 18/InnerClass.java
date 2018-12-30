public class InnerClass
{
 private static String staticAttribute="Outter class' static attribute";
 private String instantiateAttribute="Outter class' instantiate attribute";
 public static void staticMethod()
 {
  System.out.println("Outter class' static method");
 }
 public void instantiateMethod()
 {
  System.out.println("Outter class' instantiate method");
 }
 public static class StaticInnerClass
 {
 	public StaticInnerClass()
 	{
   System.out.println("static Inner class");
  }
  public void access()
  { 
   System.out.println(staticAttribute);	
   staticMethod();
  } 
 }
 
 public class InstantiateInnerClass
 {
 	public InstantiateInnerClass()
 	{
 	 System.out.println("instantiate Inner class");	
 	 staticMethod();
 	}	
 	public void access()
 	{
   System.out.println(instantiateAttribute);
   instantiateMethod();
   
   //非static 類別中允許有static類別等級的成員存在
   //***********************************************
   System.out.println("=============================================");
   System.out.println("非static 類別中允許有static類別等級的成員存在");
   System.out.println(staticAttribute);
   staticMethod();
   System.out.println("=============================================");
   //***********************************************
  } 
 }

}