public class EXAME163
{
 private final int id;
 public EXAME163(int id)
 { this.id=id; }
 public void updateID(int newId)
 {
  id=newId;
 }
 public static void main(String argv[])
 {
  EXAME163 fa=new EXAME163(42);
  fa.updateID(69);
  System.out.println(fa.id);
 }
}