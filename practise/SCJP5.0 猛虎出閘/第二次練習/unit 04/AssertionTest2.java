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
 	 System.out.println("���Z���ର�t��,"+score);
 	 return;	
 	}	
  if(score>=60)
   System.out.println("�z�����Z�ή�F!");
  else
   System.out.println("�z�����Z���ή�!");
  } 
}