public class AssertTest1
{
 public static void main(String argv[])
 {
  int score=-20;
  assert (score>=0):"���Z�����D: "+score;
  if(score>60) System.out.println("�z�ή�F");
  else System.out.println("�z���ή�");
 }
}