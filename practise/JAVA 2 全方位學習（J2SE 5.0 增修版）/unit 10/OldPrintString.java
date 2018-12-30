public class OldPrintString
{
 public static void print(String array[])
 {
  if (array==null) 
    return;
 
  System.out.print("[");
   for (int i=0;i<=array.length-2;i++)
   { System.out.print(array[i]+",");}
  System.out.print(array[array.length-1]+"]"); 
 }
}