import java.util.*;
public class Test004
{
 public static void main(String argv[])
 {
   String array1[]={"SCJP","LPIC1","ECSS","CEH"};
   String array2[]=new String[array1.length];
   String array3[]={"SCJP","LPIC2","ECSS","CEH"};  
   System.arraycopy(array1,0,array2,0,array1.length);
   System.out.println("array1="+Arrays.toString(array1));
   System.out.println("array2="+Arrays.deepToString(array2));
   for(String obj:array3)
    System.out.print(obj+",");
   System.out.println();
   System.out.println("array1==array2?"+Arrays.equals(array1,array2));
   System.out.println("array1==array3?"+Arrays.equals(array1,array3));
 }
}