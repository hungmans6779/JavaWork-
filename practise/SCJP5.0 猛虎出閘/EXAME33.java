class Test
{
 Boochy booch;
 public Test()
 {
  booch=new Boochy(this);
 }
}

class Boochy
{
 Test smooch;
 public Boochy(Test s)
 {
  smooch=s;
 }
}

public class EXAME33 
{
 public static void main(String argv[])
 {
  Test snoog=new Test();
  
  snoog=null;
 }
}