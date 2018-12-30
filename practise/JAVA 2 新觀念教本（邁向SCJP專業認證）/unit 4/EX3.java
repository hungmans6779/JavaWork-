class EX3
{
 public static void main(String argv[])
 {
  //int i=Integer.parseInt(argv[0]);
  int i=Integer.valueOf(argv[0]).intValue();
  System.out.println("所傳入的值為 : "+i);
  if(i%2==0)
  {
   System.out.println("是偶數.....");	
  }	
  if(i%2==1)
  {
   System.out.println("是奇數.....");	
  }	
 }
}