public class EXAME48
{
 int bootch;
 String snootch;
 public EXAME48()
 {
  this("snootchy");
  System.out.print("first");
 }
 public EXAME48(String snootch)
 {
  this(420,"snootchy");
  System.out.print("second");
 }
 public EXAME48(int bootch,String snootch)
 {
  this.bootch=bootch;
  this.snootch=snootch;
  System.out.print("third");
 }
 public static void main(String argv[])
 {
  EXAME48 exame48=new EXAME48();
  System.out.print(exame48.snootch+" "+exame48.bootch);
 }
}