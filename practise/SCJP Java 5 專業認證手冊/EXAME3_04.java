public class EXAME3_04
{
 public static void main(String argv[])
 {
  int [][] a={{1,2,},{3,4}};
  int []b=(int[])a[1];
  Object o1=a;
  int [][]a2=(int[][])o1;
  //int[]b2=(int[])o1; //����ɴ�����ClassCastException���ҥ~
  //int []b2=(int[])o1[1]; //�sĶ���~
  System.out.println(b[1]);
 }
}