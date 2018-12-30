import java.util.*;
public class EXAME6_14
{
 public static void main(String argv[])
 {
 	/*
  Scanner sc1=new Scanner("123 A 3b c,45, x5x,76 82 L");
  while(sc1.hasNext())
  {
   System.out.print(sc1.nextInt()+" ");	
  }	
  */
  /*
  Scanner sc2=new Scanner("123 A 3b c,45, x5x,76 82 L").useDelimiter(" ");
  while(sc2.hasNext())
  {
   System.out.print(sc2.nextInt()+" ");	
  }
  */
  //===============================================================
  Scanner sc3=new Scanner("123 A 3b c,45, x5x,76 82 L");
  while(sc3.hasNext())
  {
   if(sc3.hasNextInt())
   {
    System.out.print(sc3.nextInt()+" ");	
   }
   else
   {
    sc3.next();	
   }	 
  }
  //===============================================================
  System.out.println();
  Scanner sc4=new Scanner("123 A 3b c,45, x5x,76 82 L").useDelimiter(" ");
  while(sc4.hasNext())
  {
   if(sc4.hasNextInt())
   {
    System.out.print(sc4.nextInt()+" ");	
   }
   else
   {
    sc4.next();	
   }	 
  }
 //===============================================================
 /*
  System.out.println();
  Scanner sc5=new Scanner("123 A 3b c,45, x5x,76 82 L").useDelimiter(" ");
  do
  {
   if(sc5.hasNextInt())
   {
    System.out.print(sc5.nextInt()+" ");	
   }
  }while(sc5.hasNext());
  */
 //===============================================================
  /*
  System.out.println();
  Scanner sc6=new Scanner("123 A 3b c,45, x5x,76 82 L");
  do
  {
   if(sc6.hasNextInt())
   {
    System.out.print(sc6.nextInt()+" ");	
   }
  }while(sc6.hasNext());
  */
 //===============================================================
 //=============================================================== 
 }
}