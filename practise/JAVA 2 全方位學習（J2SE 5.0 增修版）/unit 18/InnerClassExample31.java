public class InnerClassExample31
{
 private int att=0;	
 private String str="instantiate string";
 public static void main(String argv[])
 {
 	new InnerClassExample31();
 }	
 public InnerClassExample31()
 {
 	new InnerClass31(2);
 }	
 
 //崁入式類別InnerClass31
 public class InnerClass31
 {
 	private int count=0;
 	private int att=1;
 	public InnerClass31(int att)
 	{
 		System.out.println(str);
 		System.out.println(att);
 		System.out.println(this.att);
 		System.out.println(InnerClassExample31.this.att);
 		count++;
 		access();
 		System.out.println("count : "+count);
 	}	
 	public void access()
 	{
 	 System.out.println(str);
 	 count++;
 	}	
 }	
}