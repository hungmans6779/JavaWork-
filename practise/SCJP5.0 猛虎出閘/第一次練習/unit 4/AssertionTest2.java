public class AssertionTest2
{
 static int score;
 static void showScore(int score)
 {
 	//==========================================================
 	//�ΨӽT�{Assertion���Ұ�.................
 	boolean enableAssertion=false;
 	assert(enableAssertion=true);
 	if(enableAssertion)
 	{ 
 		System.out.println("Assertion�\��w�g���}�F......"); 
 		System.out.println();
 	}
 	else
 	{
 	 System.out.println("Assertion�\��S�����}�I�I�I......"); 
 	 System.out.println();
 	}
 	//==========================================================
 	
 	if(score<0)
 	{
 	 System.out.println("�z�����Z���~ : "+score);
 	 return;	
 	}	
  
  if(score > 60)
  {
   System.out.println("�A�����Z�O :"+score+" ���ή�F");
  }
  else
  {
   System.out.println("�z�����Z�O : "+score+" �����ή�.....");
  }
 }
 public static void main(String argv[])
 {
  showScore(Integer.parseInt(argv[0]));
 }
}