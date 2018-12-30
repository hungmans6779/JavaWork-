import java.util.Arrays;
public class ToStringv1
{
 public static void main(String argv[])
 {
  int a[]={1,2,3,4,5};
  System.out.println("a[]���}�C�� = "+Arrays.toString(a));
  
  String str[]={"abc","def","ghi"};
  System.out.println("str[]���}�C�� = "+Arrays.toString(str));
  
  Object obj[]={a,str,new java.util.Date()};
  System.out.println("obj[]���}�C�� = "+Arrays.deepToString(obj));
  
  int aq[]={1,2,3};
  int bq[]={1,2,3};
  int cq[]={4,5,6}; 
  System.out.println("aq[]���}�C���e�� = "+Arrays.toString(aq));
  System.out.println("bq[]���}�C���e�� = "+Arrays.toString(bq));
  System.out.println("cq[]���}�C���e�� = "+Arrays.toString(cq));
  System.out.println("���aq[]��bq[]�}�C�����e�O�_�۵� = "+Arrays.equals(aq,bq));
  System.out.println("���aq[]��cq[]�}�C�����e�O�_�۵� = "+Arrays.equals(aq,cq));
  System.out.println("���bq[]��cq[]�}�C�����e�O�_�۵� = "+Arrays.equals(bq,cq));
  
  Object ob1[]={aq,bq};
  Object ob2[]={aq,cq};
  Object ob3[]={bq,cq};
  System.out.println("ob1[]���}�C���e�� = "+Arrays.deepToString(ob1));
  System.out.println("ob2[]���}�C���e�� = "+Arrays.deepToString(ob2));
  System.out.println("ob3[]���}�C���e�� = "+Arrays.deepToString(ob3));
  System.out.println("ob1[]�Poj2[]�O�_�۵� = "+Arrays.deepEquals(ob1,ob2));
  System.out.println("ob1[]�Poj3[]�O�_�۵� = "+Arrays.deepEquals(ob1,ob3));
  System.out.println("ob2[]�Poj3[]�O�_�۵� = "+Arrays.deepEquals(ob2,ob3));
 }
}