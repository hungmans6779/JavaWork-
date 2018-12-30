public class AutoBoxingSwitchTest1
{
 public static void main(String argv[])
 {
 	Integer i=200;
 	switch(i)
 	{
 	 case 100:
 	  System.out.println("i= 100");
 	  break;
 	 case 200:
 	  System.out.println("i= "+i);
 	  break;
 	 case 300:
 	  System.out.println("i= "+300);
 	  break;
 	 default:
 	  System.out.println("µL¸Ñ");
 	  break;    	
 	}	 
 }
}