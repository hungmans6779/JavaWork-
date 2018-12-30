import java.util.Arrays;
public class Test005
{
 public static void main(String argv[])
 {
  int array1[]={45,34,23,5646,75,7,34,656,3,63,363,63};
  System.out.println("排序前："+Arrays.toString(array1));
  Arrays.sort(array1);
  System.out.println("排序後："+Arrays.toString(array1));
  System.out.println("==================================");
  int array2[]={34,31343,35,46236,26,242,52,525};
  System.out.println("array2="+Arrays.toString(array2));
  Arrays.sort(array2,1,3);
  System.out.println("只排序index是1-3的資料:"+Arrays.toString(array2));
  System.out.print("====================================");
  System.out.println();
  System.out.println("array1的陣列內容是："+Arrays.toString(array1));
  System.out.println("array1陣列中的45的值index="+Arrays.binarySearch(array1,45));
  System.out.println("array1陣列中的41的值index="+Arrays.binarySearch(array1,41));
 }
}