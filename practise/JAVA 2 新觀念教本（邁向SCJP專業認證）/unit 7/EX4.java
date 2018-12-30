class EX4
{
 EX4 ex;
 int i;
 public static void main(String argv[])
 {
   EX4 obj=new EX4();
   obj.ex=new EX4();
   obj.ex.i=1;
   obj.ex.ex=new EX4();
   obj.ex.ex.i=2;
   System.out.println("obj.i=\t\t"+obj.i);
   System.out.println("obj.ex.i=\t"+obj.ex.i);
   System.out.println("obj.ex.ex.i=\t"+obj.ex.ex.i);
 }
}