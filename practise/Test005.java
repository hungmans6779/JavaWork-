import java.util.Arrays;
public class Test005
{
 public static void main(String argv[])
 {
  int array1[]={45,34,23,5646,75,7,34,656,3,63,363,63};
  System.out.println("�Ƨǫe�G"+Arrays.toString(array1));
  Arrays.sort(array1);
  System.out.println("�Ƨǫ�G"+Arrays.toString(array1));
  System.out.println("==================================");
  int array2[]={34,31343,35,46236,26,242,52,525};
  System.out.println("array2="+Arrays.toString(array2));
  Arrays.sort(array2,1,3);
  System.out.println("�u�Ƨ�index�O1-3�����:"+Arrays.toString(array2));
  System.out.print("====================================");
  System.out.println();
  System.out.println("array1���}�C���e�O�G"+Arrays.toString(array1));
  System.out.println("array1�}�C����45����index="+Arrays.binarySearch(array1,45));
  System.out.println("array1�}�C����41����index="+Arrays.binarySearch(array1,41));
 }
}