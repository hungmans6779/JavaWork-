public class AssertionTest2
{
 private int score;	
 public static void main(String argv[])
 {
 	AssertionTest2 at=new AssertionTest2();
  at.setScore(-10);
  at.printScore();
  	
 }
 public void setScore(int score)
 {
  this.score=score;	
 }	
 private void printScore()
 {
 	if(score<0)
 	{
 	 System.out.println("成績不能為負數,"+score);
 	 return;	
 	}	
  if(score>=60)
   System.out.println("您的成績及格了!");
  else
   System.out.println("您的成績不及格!");
  } 
}