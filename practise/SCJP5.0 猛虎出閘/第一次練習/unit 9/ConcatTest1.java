public class ConcatTest1
{
 public static void main(String argv[])
 {
  String s1="JAVA ";
  s1+="SCJP ";
  System.out.println("s1= "+s1);
  
  String s2="JAVA ";
  s2.concat("SCJP ");
  System.out.println("s2= "+s2);
  
  String s3="JAVA ";
  s3=s3.concat("SCJP ").concat("5.0");
  System.out.println("s3= "+s3);
  
  String s4;
  s4="JAVA ".concat("SCJP ").concat("5.0");
  System.out.println("s4= "+s4);
  
  String s5="JAVA ".concat("SCJP ").concat("5.0");
  System.out.println("s5 ="+s5);
  
  String s6="JAVA ";
  s6.concat("SCJP ").concat("5.0");
  System.out.println("s6= "+s6);
  
  String s7="JAVA ";
  //s7 concat("SCJP");
  System.out.println("s7= "+s7);
  
 }
}