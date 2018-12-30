public class Test13
{
 public static void main(String argv[])
 {
  int [] i1=new int[]{1,2,3,4,5};
  int [] i2={1,2,3,4,5};
  //int [] i3=new int[5]{1,2,3,4,5};
  Object o1=new int[10];
  Object o2=new int[]{1,2,3,4,5};
  System.out.println("i1="+i1[0]+i1[1]+i1[2]+i1[3]+i1[4]);
  System.out.println("i2="+i2[0]+i2[1]+i2[2]+i2[3]+i2[4]); 
  System.out.println("o1="+o1);
  System.out.println("o2="+o2);
 }
}