public class EXAME171
{
 public void count(int i)
 {
  count(++i);
 }
 public static void main(String argv[])
 {
  EXAME171 exame171=new EXAME171();
  exame171.count(3);
 }
}