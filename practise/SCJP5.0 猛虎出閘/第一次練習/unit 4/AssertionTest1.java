public class AssertionTest1
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
 	
 	
  assert (score >=0):"���Z�����D : "+score; //������L�A�Ψӧ�Bug�Ϊ�..........
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