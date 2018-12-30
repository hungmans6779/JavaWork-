abstract class People
{
 public abstract String run();
 public String song()
 {
  return "我會唱歌";
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
   	 return "我會跑步喔";	
   	}	
   }.run());	
  
   
 }
}