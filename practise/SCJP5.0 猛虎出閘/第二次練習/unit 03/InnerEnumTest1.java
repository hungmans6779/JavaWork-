public class InnerEnumTest1
{
 private enum Week{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
 public  static void main(String argv[])
 {
 	System.out.println(Week.Sunday);	

 	System.out.println("============================");
 	Week w1=Week.Monday;
 	System.out.println(w1);
 	System.out.println(w1.Monday);

 	System.out.println("============================");
 	Week [] w2=Week.values();
 	for(int i=0;i<w2.length;i++)
 	 System.out.print(w2[i]+",");	
 		
	System.out.println("\n============================");
	for(Week w3:Week.values())
	 System.out.print(w3+",");
	 
 	System.out.println("\n============================");
 	System.out.println(Week.valueOf("Sunday"));
 	
 	System.out.println("============================");
 	System.out.println(Week.valueOf(Week.class,"Friday"));
 }	
}