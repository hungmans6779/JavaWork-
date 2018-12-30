public class testInterface
{
 public static void main(String argv[])
 {	
  test t=new test();
  t.move();
 }	
}	
class test implements testInterface1
{
 public void move()
 {
  System.out.println("§Ú·|¶]§r.......");  	
 }	
}

interface testInterface1
{
 public void move();
}