public class EX23
{
 public static void main(String argv[])
 {
  銀行帳號 哈利=new 銀行帳號("8888",100);
  哈利.存款(2000);
  哈利.提款("6666",10000);
  哈利.提款("8888",10000);
  哈利.查詢("8888");
  哈利.提款("8888",1000);
  //System.out.println(哈利.金額);
 }
}

class 銀行帳號
{
 private String 密碼;
 private int 金額;
 public 銀行帳號(String 密碼,int 存入金)
 {
  this.密碼=密碼;
  金額=存入金;
  System.out.print("恭禧開戶成功！ ");
  查詢();
 }
 
 public void 存款(int 存入金)
 {
 	金額+=存入金;
 	System.out.print("完成存入！ ");
 	查詢();
 }
 	
 public void 提款(String 密碼,int 提款金)
 {
  if(this.密碼.equals(密碼))
  {
   if(金額>=提款金)
   {
   	金額-=提款金;
   	System.out.print("完成提出:"+提款金);
   	查詢();
   }		
   else
   {
   	System.out.println("剩餘金額不夠提出 : "+提款金);
   }	
  }
  else
  {
   System.out.println("密碼錯誤！本次交易失敗");	
  }			
 }	
 
 public void 查詢(String 密碼)
 {
 	if(this.密碼.equals(密碼))
 	{
 	 查詢();	
 	}	
 	else
 	{
 	 System.out.println("密碼錯誤！ ");	
 	}	
 }	
 
 private void 查詢()
 {
  System.out.println("目前的金額為 : "+金額);
 }

}