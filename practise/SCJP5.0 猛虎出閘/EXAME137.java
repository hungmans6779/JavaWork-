class Super
{
 private int a;
 protected Super(int a)
 {
  this.a=a;
 }
}

public class EXAME137 extends Super
{
 public EXAME137(int a) {super(a); }
 public EXAME137(){this(5);}
 //public EXAME137(){ super(5); }
 public static void main(String argv[])
 {
 	
 }	
 
}