import java.util.Arrays;
public class Test002
{
 public static void main(String argv[])
 {
  String array1[]={"SCJP","SCWCD","MCSE"};
  int array2[]={1,2,3};
  String array[]=new String[array1.length];
  System.arraycopy(array1,0,array,0,array1.length);
  System.out.println(array);
  
  for(String o:array)
  System.out.print(o+",");
  System.out.println("====================");
  System.out.println(Arrays.toString(array));
  
  Object obj[]={array1,array2,array,new java.util.Date()};
  System.out.println("obj="+obj);
  System.out.println("====================");
  System.out.println(Arrays.toString(obj));
  System.out.println("====================");
  System.out.println(Arrays.deepToString(obj));
 }
}