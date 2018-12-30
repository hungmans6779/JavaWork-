class SimpleCalc
{
 public int value;
 public void calculate()
 {
  value+=7;
 }
}

public class EXAME25 extends SimpleCalc
{
 public void calculate()
 {
  value-=3;
 }
 public void calculate(int multiplier)
 {
  calculate();
  super.calculate();
  value*=multiplier;
 }
 public static void main(String argv[])
 {
  EXAME25 exame25=new EXAME25();
  exame25.calculate(2);
  System.out.println("value is : "+exame25.value);
 }
}