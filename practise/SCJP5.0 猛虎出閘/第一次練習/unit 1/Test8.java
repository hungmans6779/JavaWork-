class Test8
{
 public static void main(String argv[])
 {
  int i=1,j=2;
  String s=(i<j)?"正確":"不正確";
  System.out.println("(1<2) = "+s);
  System.out.println("(1<2) = " +((i<j)?"正確":"不正確"));
  
  String s1="Java ";
  String s2=" SCJP";
  int i1=1,i2=2;
  System.out.println(i1+i2);
  System.out.println(s1+i2+s2);
  String s3=String.valueOf(i1);
  System.out.println(s3);
  
 }
}	