abstract class People
{
 public abstract String run();
 public String song()
 {
  return "�ڷ|�ۺq";
 }
}

public class cTest38
{
 public static void main(String argv[])
 {
   System.out.println(new People()
   {
   	public String run()
   	{
   	 return "�ڷ|�]�B��";	
   	}	
   }.run());	
  
   
 }
}