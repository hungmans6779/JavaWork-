public class AssertionSample
{
 private int score;
 private void printScore()
 {
 	assert(score>=0):"score is error! score="+score;
  if(score>=60)
  {
   System.out.println(score+"是及格分數！");
  }
  else
  {
   System.out.println(score+"是不及格的分數！");
  }
 }
 public void setScore(int score)
 {
  this.score=score;
  printScore();
 }
 public static void main(String argv[])
 {
  new AssertionSample().setScore(-10);	
 }
}