public class Test5
{
 Test5()
 { System.out.println("no-arg const"); }
 Test5(int x)
 { System.out.println("1-arg const"); }
 static 
 { System.out.println("1nd static variable"); }
 { System.out.println("1nd instance variable"); }
 { System.out.println("2nd instance variable"); }
 static 
 { System.out.println("2nd static variable"); }
 public static void main(String argv[])
 {
  new Test5();
  new Test5(3);
 }
}