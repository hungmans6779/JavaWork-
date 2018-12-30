import java.util.*;
public class Test023
{
 public static void main(String argv[])
 {
  Scanner kegin=new Scanner(System.in);
  System.out.print("叫块计===>");
  int input=kegin.nextInt();
  if(input>=0)
  {
   if(input%2==0)
    System.out.println("琌案计");
   else
    System.out.println("琌计");
  }
  else
   System.out.println("璽⊿Τ案计");	
 }
}