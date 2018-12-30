public class EXAME3_04
{
 public static void main(String argv[])
 {
  int [][] a={{1,2,},{3,4}};
  int []b=(int[])a[1];
  Object o1=a;
  int [][]a2=(int[][])o1;
  //int[]b2=(int[])o1; //執行時期產生ClassCastException的例外
  //int []b2=(int[])o1[1]; //編譯錯誤
  System.out.println(b[1]);
 }
}