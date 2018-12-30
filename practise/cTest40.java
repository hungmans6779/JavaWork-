interface InterfaceTest40
{
 int i=10;
 void showI();
 public static final int j=20;
 public abstract void showJ();
}

public class cTest40
{
 public static void main(String argv[])
 {
  InterfaceTest40 kk=new InterfaceTest40()
  {
   public void showI()
   {
   	System.out.println(i);
   }		
   public void showJ()
   {
   	System.out.println(j);
   }	
  };
  kk.showI();
  kk.showJ();
 }
}