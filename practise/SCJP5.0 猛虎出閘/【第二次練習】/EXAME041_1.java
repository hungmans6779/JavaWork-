class Test1
{
 static { System.out.println("static 1"); }
 {System.out.println("instance 1");}
 public Test1(){ System.out.println(1);}
}

class Test2 extends Test1
{
 static {System.out.println("static 2"); }
 { System.out.println("instance 2"); }
 public Test2(){ System.out.println(2); }
}

class Test3 extends Test2
{
 static { System.out.println("static 3"); }
 { System.out.println("instance 3") ; }
 public Test3() {System.out.println(3);  }
}

public class EXAME041_1
{
 public static void main(String argv[])
 {
  new Test3();
 }
}