class Father
{
 public int leg=5;
}

class Son extends Father
{
 public int leg;	
 public void go()
 {
 	leg=4;
  System.out.println("Son:"+leg);
  System.out.println("Father:"+super.leg );
 }	
}
public class Test3
{
 public static void main(String argv[])
 {
  new Son().go();
 }
}