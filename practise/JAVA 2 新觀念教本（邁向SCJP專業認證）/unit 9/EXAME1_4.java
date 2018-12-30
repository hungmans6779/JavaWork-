interface IA{}
class CB implements IA{}
class CC implements IA{}
class EXAME1_4 extends CC
{
 public static void main(String argv[])
 {
  IA a=new EXAME1_4();
  CB b=new CB();
  CC c=new CC();
  //c=(Test)a;
  //b=(Test)a;
  //b=c;
  //c=a;
  a=b;
 }
}