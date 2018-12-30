interface DeclareStuff
{
 public static final int EASY=3;
 void doStuff(int t);
}

public class EXAME160 implements DeclareStuff
{
 public static void main(String argv[])
 {
  int x=5;
  new EXAME160().doStuff(++x);
 }
 void doStuff(int s)
 {
  s+=EASY+ ++s;
  System.out.println("s "+s);
 }
}