public class AssertionTest1
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
 	
 	
  assert (score >=0):"成績有問題 : "+score; //此為哨兵，用來抓Bug用的..........
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