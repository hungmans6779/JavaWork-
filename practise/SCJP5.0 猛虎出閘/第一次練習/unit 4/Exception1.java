class ExceptionSon1 extends Exception
{
 public ExceptionSon1()
 {
  System.out.println("我.....");
 }
 public void showError()
 {
  System.out.println("我是ExceptionTest1");
 }
}

public class Exception1
{
 public static void main(String argv[])
 {
  try
  {
   dd(2);
  }
  catch(ExceptionSon1 e)
  {
   e.getMessage();
   e.showError();
  }
 }
 public static void dd(int i) throws ExceptionSon1
 {
  if(i==1)
  {
   throw new ExceptionSon1();
  }
  else
  {
  System.out.println("程式沒有例外");
  }
 }
}