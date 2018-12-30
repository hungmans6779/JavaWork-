public class AssertTest1
{
 public static void main(String argv[])
 {
  int score=-20;
  assert (score>=0):"成績有問題: "+score;
  if(score>60) System.out.println("您及格了");
  else System.out.println("您不及格");
 }
}