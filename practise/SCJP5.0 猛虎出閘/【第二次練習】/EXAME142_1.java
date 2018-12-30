import java.util.*;
public class EXAME142_1
{
 public static void main(String argv[])
 {
  String csv="Sue,5,true,3";
  Scanner scanner=new Scanner(csv);
  scanner.useDelimiter(",");
  while(scanner.hasNext())
  {
   if(scanner.hasNextInt())
   { System.out.println(scanner.nextInt()); }
   else if(scanner.hasNextBoolean())
   { System.out.println(scanner.nextBoolean()); }
   else
   { System.out.println(scanner.next());}
  }
 }
}