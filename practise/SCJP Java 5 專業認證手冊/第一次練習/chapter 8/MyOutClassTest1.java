public class MyOutClassTest1
{
 private int x=10;
 private static int y=20;

 public static void main(String argv[])
 {
 	new MyOutClassTest1().new InnerClass().get();
 //	new MyOutClassTest1().new InnerClass().get().new MethodInnerClass().getZ();
 }	
 public class InnerClass
 {
 	InnerClass()
 	{
 	 System.out.println("§Ú¬OInnerClass");	
 	}	
 	int x=100;
 	public void get()
 	{
 	 final int z=3000;	
 	 class MethodInnerClass
 	 {
 	 	public void getZ()
 	 	{
      System.out.println("z = "+z); 	 		
 	 	}	
 	 }	
 	 new MethodInnerClass().getZ();	
 	 int x=1000;	
 	 System.out.println("MyOutClassTest1.y = "+MyOutClassTest1.y);
 	 System.out.println("MyOutClassTest1.this.y = "+MyOutClassTest1.this.y);
 	 //System.out.println("MyOutClassTest1.x = "+MyOutClassTest1.x);
 	 System.out.println("MyOutClassTest1.this.x = "+MyOutClassTest1.this.x);
 	 System.out.println("this.x= "+this.x);
   System.out.println("x = "+x);
  } 
 }
 
 
  public void gg()
 {
 	//static int k=0;
 	int kk=0;
 }	
 public static void getg()
 {
 	//static int kkk=0;
 	int kk=0;
 }	
}