import java.util.Arrays;
public class Arrayv1
{
 public static void main(String argv[])
 {
  int array[]={3,54,21,57,33,2,5,11,64,45,23,10,1,43,443};
  System.out.println("�Ƨǫearray[] = "+Arrays.toString(array));
  Arrays.sort(array);
  System.out.println("�Ƨǫ�array[] = "+Arrays.toString(array));
  System.out.println("=========================================");
  int array1[]={3,54,21,57,33,2,5,11,64,45,23,10,1,43,443};
  System.out.println("�Ƨǫearray1[] = "+Arrays.toString(array1));
  Arrays.sort(array1,2,8);
  System.out.println("�Ƨǫ�array1[] = "+Arrays.toString(array1));
 }
}