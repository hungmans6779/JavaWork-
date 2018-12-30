public class EXAME85
{
 public enum Dogs {GREEN,BLACK,RED,BLUE}  
 public static void main(String argv[])
 {
  Dogs myDog=Dogs.BLUE;
  switch(myDog)
  {
   GREEN: System.out.println("GREEN"); 
   BLUE: System.out.println("BLUE");
   default: System.out.println("Default");
   RED: System.out.println("RED");	
  }	
 }
}