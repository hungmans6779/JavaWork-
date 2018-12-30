class Uber
{
 static int y=2;
 Uber(int x)
 {
  this();
  y=y*2;
 }
 Uber()
 {
  y++;
 }
}

public class EXAME2_11 extends Uber
{
 EXAME2_11()
 {
  super(y);y=y+3;
 }
 public static void main(String argv[])
 {
  new EXAME2_11();
  System.out.println("y = "+y);
 }
}