public class InnerClassExample3
{
 private int att=0;	
 public static void main(String argv[])
 {
 	new InnerClassExample3();
 }	
 public InnerClassExample3()
 {
 	new InnerClass3(2);
 }	
 
 //崁入式類別InnerClass3
 public class InnerClass3
 {
 	private int att=1;
 	public InnerClass3(int att)
 	{
 		System.out.println(att);
 		System.out.println(this.att);
 		System.out.println(InnerClassExample3.this.att);
 	}	
 }	
}