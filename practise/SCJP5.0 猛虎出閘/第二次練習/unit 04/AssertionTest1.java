public class AssertionTest1
{
 private int score;	
 public static void main(String argv[])
 {
 	AssertionTest1 at=new AssertionTest1();
  at.setScore(-10);
  at.printScore();
  	
 }
 public void setScore(int score)
 {
  this.score=score;	
 }	
 private void printScore()
 {
 	assert (score>=0):"���Z���~!score="+score;
  if(score>=60)
   System.out.println("�z�����Z�ή�F!");
  else
   System.out.println("�z�����Z���ή�!");
  } 
}