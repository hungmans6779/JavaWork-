class Super
{
 private int a;
 protected Super(int a)
 {
  this.a=a;
 }
}

public class EXAME137_1 extends Super
{
 public EXAME137_1(int a) {super(a); }
 public EXAME137_1(){this(5);}
 //public EXAME137_1(){ super(5); }
 public static void main(String argv[])
 {
 	
 }	
 
}