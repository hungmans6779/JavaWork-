public class EX1
{
 public static void main(String argv[])
 {
 	EX1 ex1=new EX1();
 	EX1 ex2=new EX1();
 	EX1 ex3=ex1;
 	System.out.println("ex1 �M ex2 �@�� : "+ex1.equals(ex2));
 	System.out.println("ex1 �M ex3 �@�� : "+ex1.equals(ex3));
 	System.out.println("ex1 == ex3 : "+(ex1==ex3));
 }		
}