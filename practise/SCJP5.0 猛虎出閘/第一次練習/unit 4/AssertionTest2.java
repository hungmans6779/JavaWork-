public class AssertionTest2
{
 static int score;
 static void showScore(int score)
 {
 	//==========================================================
 	//用來確認Assertion有啟動.................
 	boolean enableAssertion=false;
 	assert(enableAssertion=true);
 	if(enableAssertion)
 	{ 
 		System.out.println("Assertion功能已經打開了......"); 
 		System.out.println();
 	}
 	else
 	{
 	 System.out.println("Assertion功能沒有打開！！！......"); 
 	 System.out.println();
 	}
 	//==========================================================
 	
 	if(score<0)
 	{
 	 System.out.println("您的成績有誤 : "+score);
 	 return;	
 	}	
  
  if(score > 60)
  {
   System.out.println("你的成績是 :"+score+" 分及格了");
  }
  else
  {
   System.out.println("您的成績是 : "+score+" 分不及格.....");
  }
 }
 public static void main(String argv[])
 {
  showScore(Integer.parseInt(argv[0]));
 }
}