public class StringBuilderTest1_1 extends StringBuilder
{
 StringBuilderTest1_1(String str)
 {
  super(str);	
 }		
 public static void main(String argv[])
 {
  StringBuilderTest1_1 sb1=new StringBuilderTest1_1("Hello ");
  sb1.append("Java");
  System.out.println("sb1 = "+sb1);
 }
}