import java.util.*;
public class cTest70
{
 public static void main(String argv[])
 {
 	System.out.println(Math.round(34.5));
 	System.out.println(Math.ceil(34.3));
 	System.out.println(Math.floor(34.6));
 	System.out.println(Math.max(23,Math.min(24,454)));
 	for(int i=1;i<=100;i++)
 	{
 	 System.out.print((int)(Math.random()*40)+"\t");
 	}
 	
 	System.out.println("\n*******************************");
 	int count=0; 
 	int value=0;
 	do
 	{
 	 value=(int)(Math.random()*60);	
 	 System.out.println("²Ä"+(++count)+"¦¸¬O"+value);
 	}while(value>1);	
 	
 	
 }	
}	