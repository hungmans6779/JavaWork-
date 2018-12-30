class EX24
{
 static int i=6;
 String s;
 static
 {
  EX24 ex=new EX24("static block test¡I");
  System.out.println(ex.s);
  System.out.println(++ex.i);
 }
 public EX24(String s)
 {
  this.s=s;
 }
}