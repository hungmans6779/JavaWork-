public class EXAME163_1
{
 private  int id;
 public EXAME163_1(int id)
 { this.id=id; }
 public void updateID(int newId)
 {
  id=newId;
 }
 public static void main(String argv[])
 {
  EXAME163_1 fa=new EXAME163_1(42);
  fa.updateID(69);
  System.out.println(fa.id);
 }
}