class Father1
{
 void aMethod()
 {
  System.out.println("�I�s�����O��aMethod!");
 }
}

public class Son1 extends Father1
{
 public static void main(String argv[])
 {
  Father1 son=new Son1();
  son.aMethod();
 }
 void aMethod()
 {
  System.out.println("�I�s�l���O��aMethod!");	
  //super.aMethod();
 }	
}