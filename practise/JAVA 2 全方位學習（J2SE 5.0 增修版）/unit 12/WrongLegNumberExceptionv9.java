public class WrongLegNumberExceptionv9 extends RuntimeException
{
 public WrongLegNumberExceptionv9()
 {
  super("Leg number must be 0,2 or 4 ¡I");
 }
 public WrongLegNumberExceptionv9(String str)
 {
  super(str);
 }
}