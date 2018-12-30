public class EXAME7
{
 public static void main(String argv[])
 {
 	/*
  String s1="123456789";
  s1=(s1-"123");
  */
  
  StringBuffer s2=new StringBuffer("123456789");
  s2.delete(0,3).replace(1,3,"24").delete(4,6);
  System.out.println("s2 = "+s2);
  
  /*
  StringBuffer s3=new StringBuffer("123456789");
  s3.substring(3,6).delete(1,3).insert(1,"24");
  System.out.println("s3 = "+s3);
  */
  StringBuffer s5=new StringBuffer("123456789");
  s5.delete(0,3).replace(1,3,"").delete(2,5).insert(1,"24");
  System.out.println("s5 = "+s5);
 }
}