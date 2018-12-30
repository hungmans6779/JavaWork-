import java.util.Arrays;
import java.util.List;
public class Arrayv2
{
 public static void main(String argv[])
 {
  int array[]={23,4,21,13,53,131,43,12};
  int index1=0;
  System.out.println("array[]的陣列內容為 = "+Arrays.toString(array));
  for (int i=0;i<array.length;i++)
  {
   if (array[i]==21)
   { 
    System.out.println("The index of 21 is "+i);
    break;
   }
  }
   
  //實施binarySearch要先sort才可以...............
  Arrays.sort(array);
  System.out.println("array[]的陣列內容為 = "+Arrays.toString(array));
  int index=Arrays.binarySearch(array,21);
  System.out.println("The index of 21 is "+index);
  index=Arrays.binarySearch(array,55);
  System.out.println("The index of 55 is "+index);
  
  
  String str[]={"a","e","o","i","u"};
  Arrays.sort(str);
  System.out.println("str[]的陣列內容為 = "+Arrays.toString(str));
  int index2=Arrays.binarySearch(str,"o");
  System.out.println("The index of o is "+index2); 
  
  String str1[]={"a","e","i","o","u"};
  List ls=Arrays.asList(str1);
  int index3=ls.indexOf("o");
  System.out.println("The index of o is "+index3);
  
 }
}