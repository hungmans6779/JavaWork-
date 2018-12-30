interface Car
{ void run(); }
class RunCar implements Car
{
 public void run()
 {
  System.out.println("§Ú¬O¶]¨®");
 }
}
public class ReturnTest1_4
{
 public Car getName()
 {
  return new RunCar();
 }
 public static void main(String argv[])
 {
  ReturnTest1_4 r4=new ReturnTest1_4();
  Car c=r4.getName();
  c.run();
 }
}