import java.util.*;
public class EXAME2
{
 public static void main(String argv[])
 {
  List<List<Integer>>table=new ArrayList<List<Integer>>();
  for(int i=0;i<=10;i++)
  {
   List<Integer>row=new ArrayList<Integer>();
   for(int j=0;j<=10;j++)
   {
    row.add(i*j);	
   }		
   table.add(row);
   System.out.println(table);
  }	
 }
}