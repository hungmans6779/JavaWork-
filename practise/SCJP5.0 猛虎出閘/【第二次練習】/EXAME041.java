class Test1
{
 public Test1(){ System.out.print(1);}
}

class Test2 extends Test1
{
 public Test2(){ System.out.print(2); }
}

class Test3 extends Test2
{
 public Test3() {System.out.print(3);  }
}

public class EXAME041 
{
 public static void main(String argv[])
 {
  new Test3();
 }
}