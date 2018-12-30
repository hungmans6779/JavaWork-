class EX5
{
 public static void main(String argv[])
 {
  int age,sex;
  if(argv.length<2)
  {
   System.out.println("請輸入您的年紀及性別");
   System.out.println("性別以0(女生)或1（男生）表示");
   System.exit(0);
  }
  age=Integer.parseInt(argv[0]);
  sex=Integer.valueOf(argv[1]).intValue();
  if(age>=12)
  {
   if(sex==0)
   {
   	System.out.println("女生票為 : 50元");
   }		
   else
   {
   	System.out.println("男生票為  :60元");
   }	
  }
  else
  {
   System.out.println("年紀太小不能進入..........");	
  }		
 }
}