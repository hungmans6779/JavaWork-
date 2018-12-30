public class CharLiteralTest1
{
 public static void main(String argv[])
 {
  char c1='\u2354';
  System.out.println("c1 = "+c1);
  char c2=5423;
  System.out.println("c2 = "+c2);
  char c3=(char)65;
  System.out.println("c3 = "+c3);
  char c4=(char)70000;
  System.out.println("c4 = "+c4);
  char c5=(char)-65;
  System.out.println("c5 = "+c5);
 }
}